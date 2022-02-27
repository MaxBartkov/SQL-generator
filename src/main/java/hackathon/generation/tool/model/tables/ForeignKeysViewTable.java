/*
 * This file is generated by jOOQ.
 */
package hackathon.generation.tool.model.tables;


import hackathon.generation.tool.model.Public;
import hackathon.generation.tool.model.tables.records.ForeignKeysViewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ForeignKeysViewTable extends TableImpl<ForeignKeysViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.foreign_keys_view</code>
     */
    public static final ForeignKeysViewTable FOREIGN_KEYS_VIEW = new ForeignKeysViewTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ForeignKeysViewRecord> getRecordType() {
        return ForeignKeysViewRecord.class;
    }

    /**
     * The column <code>public.foreign_keys_view.table_schema</code>.
     */
    public final TableField<ForeignKeysViewRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.foreign_keys_view.constraint_name</code>.
     */
    public final TableField<ForeignKeysViewRecord, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.foreign_keys_view.table_name</code>.
     */
    public final TableField<ForeignKeysViewRecord, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.foreign_keys_view.column_name</code>.
     */
    public final TableField<ForeignKeysViewRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.foreign_keys_view.foreign_table_schema</code>.
     */
    public final TableField<ForeignKeysViewRecord, String> FOREIGN_TABLE_SCHEMA = createField(DSL.name("foreign_table_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.foreign_keys_view.foreign_table_name</code>.
     */
    public final TableField<ForeignKeysViewRecord, String> FOREIGN_TABLE_NAME = createField(DSL.name("foreign_table_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.foreign_keys_view.foreign_column_name</code>.
     */
    public final TableField<ForeignKeysViewRecord, String> FOREIGN_COLUMN_NAME = createField(DSL.name("foreign_column_name"), SQLDataType.VARCHAR, this, "");

    private ForeignKeysViewTable(Name alias, Table<ForeignKeysViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignKeysViewTable(Name alias, Table<ForeignKeysViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"foreign_keys_view\" as  SELECT tc.table_schema,\n    tc.constraint_name,\n    tc.table_name,\n    kcu.column_name,\n    ccu.table_schema AS foreign_table_schema,\n    ccu.table_name AS foreign_table_name,\n    ccu.column_name AS foreign_column_name\n   FROM ((information_schema.table_constraints tc\n     JOIN information_schema.key_column_usage kcu ON ((((tc.constraint_name)::name = (kcu.constraint_name)::name) AND ((tc.table_schema)::name = (kcu.table_schema)::name))))\n     JOIN information_schema.constraint_column_usage ccu ON ((((ccu.constraint_name)::name = (tc.constraint_name)::name) AND ((ccu.table_schema)::name = (tc.table_schema)::name))))\n  WHERE ((tc.constraint_type)::text = 'FOREIGN KEY'::text);"));
    }

    /**
     * Create an aliased <code>public.foreign_keys_view</code> table reference
     */
    public ForeignKeysViewTable(String alias) {
        this(DSL.name(alias), FOREIGN_KEYS_VIEW);
    }

    /**
     * Create an aliased <code>public.foreign_keys_view</code> table reference
     */
    public ForeignKeysViewTable(Name alias) {
        this(alias, FOREIGN_KEYS_VIEW);
    }

    /**
     * Create a <code>public.foreign_keys_view</code> table reference
     */
    public ForeignKeysViewTable() {
        this(DSL.name("foreign_keys_view"), null);
    }

    public <O extends Record> ForeignKeysViewTable(Table<O> child, ForeignKey<O, ForeignKeysViewRecord> key) {
        super(child, key, FOREIGN_KEYS_VIEW);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public ForeignKeysViewTable as(String alias) {
        return new ForeignKeysViewTable(DSL.name(alias), this);
    }

    @Override
    public ForeignKeysViewTable as(Name alias) {
        return new ForeignKeysViewTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignKeysViewTable rename(String name) {
        return new ForeignKeysViewTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignKeysViewTable rename(Name name) {
        return new ForeignKeysViewTable(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
