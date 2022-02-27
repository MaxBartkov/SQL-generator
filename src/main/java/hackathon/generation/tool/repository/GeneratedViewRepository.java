package hackathon.generation.tool.repository;

import hackathon.generation.tool.model.tables.ColumnsViewTable;
import hackathon.generation.tool.model.tables.ForeignKeysViewTable;
import hackathon.generation.tool.model.tables.pojos.ColumnsView;
import hackathon.generation.tool.model.tables.pojos.ForeignKeysView;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GeneratedViewRepository {

    private final DSLContext context;

    private final ColumnsViewTable COLUMNS_VIEW_TABLE = ColumnsViewTable.COLUMNS_VIEW;

    private final ForeignKeysViewTable FOREIGN_KEYS_VIEW_TABLE = ForeignKeysViewTable.FOREIGN_KEYS_VIEW;

    @Autowired
    public GeneratedViewRepository(DSLContext context) {
        this.context = context;
    }


    /**
     * Получение списка columns, которые нам нужны будут для определения data type при создании where clause statement
     * @param tables список tables по которым мы хотим получить columns
     * @return {@link ColumnsView}
     */
    public List<ColumnsView> findAllGeneratedColumnsView(List<String> tables) {
        return context.select().from(COLUMNS_VIEW_TABLE).where(COLUMNS_VIEW_TABLE.TABLE_NAME.in(tables)).fetch().into(ColumnsView.class);
    }

    /**
     * Получение списка foreign keys для дальнейшего построения дерева
     * @param tables список tables по которым мы хотим получить foreign keys
     * @return {@link ForeignKeysView}
     */
    public List<ForeignKeysView> findAllGeneratedForeignKeysView(List<String> tables) {
        return context.select().from(FOREIGN_KEYS_VIEW_TABLE).where(FOREIGN_KEYS_VIEW_TABLE.TABLE_NAME.in(tables)).fetch().into(ForeignKeysView.class);
    }

}
