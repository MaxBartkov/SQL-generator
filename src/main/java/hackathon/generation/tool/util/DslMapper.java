package hackathon.generation.tool.util;

import hackathon.generation.tool.model.dto.OrderDirection;
import org.jooq.DataType;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.SortField;
import org.jooq.Table;
import org.jooq.impl.DSL;

public final class DslMapper {

    public static Field<Object> createField(String tableName, String name) {
        return DSL.field(DSL.name(tableName, name));
    }

    public static SortField<Object> createOrderField(String tableName, String name, OrderDirection direction) {
        if(OrderDirection.ASC.equals(direction)) {
            return DSL.field(DSL.name(tableName, name)).asc();
        }
        return DSL.field(DSL.name(tableName, name)).desc();
    }

    public static Field<Object> createField(String tableName, String name, DataType dataType) {
        return DSL.field(DSL.name(tableName, name), dataType);
    }

    public static Table<Record> createTable(String name) {
        return DSL.table(DSL.name(name));
    }
}
