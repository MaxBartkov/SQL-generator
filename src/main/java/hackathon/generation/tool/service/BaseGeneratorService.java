package hackathon.generation.tool.service;

import hackathon.generation.tool.mapper.FilterMapper;
import hackathon.generation.tool.mapper.ForeignKeysMapper;
import hackathon.generation.tool.model.ForeignKeysViewTree;
import hackathon.generation.tool.model.dto.Filter;
import hackathon.generation.tool.model.dto.FilterRequestDto;
import hackathon.generation.tool.model.dto.Pagination;
import hackathon.generation.tool.model.dto.Sort;
import hackathon.generation.tool.model.tables.pojos.ColumnsView;
import hackathon.generation.tool.model.tables.pojos.ForeignKeysView;
import hackathon.generation.tool.repository.GeneratedViewRepository;
import hackathon.generation.tool.util.DslMapper;
import org.apache.commons.collections4.CollectionUtils;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.SelectConditionStep;
import org.jooq.SelectForUpdateStep;
import org.jooq.SelectOnConditionStep;
import org.jooq.SelectSeekStep1;
import org.jooq.conf.ParamType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BaseGeneratorService {

    private final GeneratedViewRepository generatedViewRepository;

    private final DSLContext context;

    @Autowired
    public BaseGeneratorService(GeneratedViewRepository generatedViewRepository, DSLContext context) {
        this.generatedViewRepository = generatedViewRepository;
        this.context = context;
    }

    /**
     * Получение SQL-запроса по списку таблиц, фильтров, пагинации и сортировке
     * @param filterDto {@link FilterRequestDto}
     * @return {@link String}
     */
    public String buildAndCacheHeadQuery(FilterRequestDto filterDto) {
        final List<String> tables = filterDto.getTables();
        final List<Filter> filters = filterDto.getFilters();
        final List<ColumnsView> columnsViewResult = generatedViewRepository.findAllGeneratedColumnsView(tables);
        final List<ForeignKeysView> tableColumnsViewResult = generatedViewRepository.findAllGeneratedForeignKeysView(tables);
        ForeignKeysViewTree tree = buildJoinTree(tableColumnsViewResult);
        SelectOnConditionStep select = buildBaseSelectQuery(tree);
        List<Condition> conditions = FilterMapper.filtersToConditions(filters, columnsViewResult);
        SelectConditionStep where = select.where(conditions);
        SelectSeekStep1 order = null;
        if(filterDto.getSort() != null) {
            Sort sort = filterDto.getSort();
            order = where.orderBy(DslMapper.createOrderField(sort.getTableName(), sort.getColumnName(), sort.getDirection()));
        }
        SelectForUpdateStep limit = null;
        if(filterDto.getPagination() != null) {
            Pagination pagination = filterDto.getPagination();
            if(order != null) {
                limit = order.limit(pagination.getPageSize()).offset(pagination.getPageNumber());
            } else {
                limit = where.limit(pagination.getPageSize()).offset(pagination.getPageNumber());
            }
        }
        return getSqlByActions(where, order, limit);
    }

    /**
     * Создание SELECT and JOIN запроса на основе ранее построенного дерева из foreign keys.
     * @param foreignKeyTree {@link ForeignKeysViewTree}
     * @return {@link SelectOnConditionStep}
     */
     private SelectOnConditionStep buildBaseSelectQuery(ForeignKeysViewTree foreignKeyTree) {
        SelectOnConditionStep select = context.select().from(DslMapper.createTable(foreignKeyTree.getParentTable()).as(foreignKeyTree.getParentTable()))
                .fullJoin(DslMapper.createTable(foreignKeyTree.getForeignTable()).as(foreignKeyTree.getForeignTable()))
                .on(DslMapper.createField(foreignKeyTree.getForeignTable(), foreignKeyTree.getForeignColumn())
                        .eq(DslMapper.createField(foreignKeyTree.getParentTable(), foreignKeyTree.getParentColumn())));
        List<ForeignKeysViewTree> foreignKeysWithoutFirst = foreignKeyTree.getChilds();
        buildSql(select, foreignKeysWithoutFirst);
        return select;
    }

    /**
     * Рекурсивно добавляет FULL JOIN к {@link SelectOnConditionStep}
     */
    private void buildSql(SelectOnConditionStep select, List<ForeignKeysViewTree> childs) {
        if(childs == null) {
            return;
        }
        for(ForeignKeysViewTree child : childs) {
            select = select.fullJoin(DslMapper.createTable(child.getParentTable()).as(child.getParentTable()))
                    .on(DslMapper.createField(child.getParentTable(), child.getParentColumn()).eq(DslMapper.createField(child.getForeignTable(), child.getForeignColumn())));
            buildSql(select, child.getChilds());
        }
    }

    private String getSqlByActions(SelectConditionStep where, SelectSeekStep1 order, SelectForUpdateStep limit) {
        if(limit != null) {
            return limit.getSQL(ParamType.INLINED);
        } else if(order != null) {
            return order.getSQL(ParamType.INLINED);
        } else {
            return where.getSQL(ParamType.INLINED);
        }
    }

    private ForeignKeysViewTree buildJoinTree(List<ForeignKeysView> tableColumnsViewResult) {
        if(CollectionUtils.isEmpty(tableColumnsViewResult)) {
            return null;
        } else if(tableColumnsViewResult.size() == 1) {
            return ForeignKeysMapper.foreignKeyViewToTree(tableColumnsViewResult.get(0));
        }
        List<ForeignKeysViewTree> trees = ForeignKeysMapper.foreignKeysViewToTrees(tableColumnsViewResult);
        Map<String, ForeignKeysViewTree> treesMap = new HashMap<>();
        for(ForeignKeysViewTree tree : trees) {
            ForeignKeysViewTree child;
            if(treesMap.containsKey(tree.getParentTable())){
                child = treesMap.get(tree.getParentTable());
            } else {
                child = ForeignKeysViewTree.deepCopy(tree);
                treesMap.put(tree.getParentTable(), child);
            }

            ForeignKeysViewTree parent;
            if(treesMap.containsKey(tree.getForeignTable())){
                parent = treesMap.get(tree.getForeignTable());
                parent.setNotParent(true);
            } else {
                parent = ForeignKeysViewTree.deepCopy(tree);
                treesMap.put(tree.getForeignTable(), parent);
            }
            parent.addChild(child);
        }
        List<ForeignKeysViewTree> result = new ArrayList<>();
        for(ForeignKeysViewTree value : treesMap.values()) {
            if(value.isNotParent()) {
                result.add(value);
            }
        }
        return result.get(0);
    }
}
