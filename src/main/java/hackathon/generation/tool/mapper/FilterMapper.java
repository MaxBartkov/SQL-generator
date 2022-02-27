package hackathon.generation.tool.mapper;

import hackathon.generation.tool.exception.BuildQueryException;
import hackathon.generation.tool.model.dto.Filter;
import hackathon.generation.tool.model.tables.pojos.ColumnsView;
import hackathon.generation.tool.util.DslMapper;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDataType;

import java.util.List;
import java.util.stream.Collectors;

public final class FilterMapper {

    public static List<Condition> filtersToConditions(List<Filter> filters, List<ColumnsView> columnsViewResult) {
        return filters.stream().map(filter -> filterToCondition(filter, columnsViewResult)).collect(Collectors.toList());
    }

    public static Condition filterToCondition(Filter filter, List<ColumnsView> columnsViewResult) {
        ColumnsView column = findColumnByName(filter, columnsViewResult);
        Field field = DslMapper.createField(filter.getTableName(), filter.getColumnName(), DefaultDataType.getDefaultDataType(SQLDialect.POSTGRES, column.getDataType()));
        String firstElementValue = filter.getValues().get(0);
        switch (filter.getOperation()) {
            case EQ: {
                return field.eq(firstElementValue);
            }
            case IN: {
                return field.in(filter.getValues());
            }
            case NE: {
                return field.ne(firstElementValue);
            }
            case LIKE: {
                return field.like(firstElementValue);
            }
            case NOT_LIKE: {
                return field.notLike(firstElementValue);
            }
            case IS_NULL: {
                return field.isNull();
            }
            case IS_NOT_NULL: {
                return field.isNotNull();
            }
            case GE: {
                return field.ge(firstElementValue);
            }
            case LE: {
                return field.le(firstElementValue);
            }
            case GT: {
                return field.gt(firstElementValue);
            }
            case LT: {
                return field.lt(firstElementValue);
            }
            case BETWEEN: {
                if(filter.getValues().size() < 2) {
                    throw new BuildQueryException("Operation BETWEEN is not possible, because you do have not two values");
                }
                return field.between(firstElementValue, filter.getValues().get(1));
            }
            case CONTAINS: {
                return field.contains(firstElementValue);
            }
            case END_WITH: {
                return field.startsWith(firstElementValue);
            }
            case START_WITH: {
                return field.endsWith(firstElementValue);
            }
            default: {
                throw new BuildQueryException("Operation not found");
            }
        }
    }

    private static ColumnsView findColumnByName(Filter filter, List<ColumnsView> columnsViewResult) {
        for(ColumnsView view : columnsViewResult) {
            if(filter.getColumnName().equalsIgnoreCase(view.getColumnName()) && filter.getTableName().equalsIgnoreCase(view.getTableName())) {
                return view;
            }
        }
        throw new BuildQueryException("Field not found");
    }

}
