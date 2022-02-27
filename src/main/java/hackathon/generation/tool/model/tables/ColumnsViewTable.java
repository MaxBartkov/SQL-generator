/*
 * This file is generated by jOOQ.
 */
package hackathon.generation.tool.model.tables;


import hackathon.generation.tool.model.Public;
import hackathon.generation.tool.model.tables.records.ColumnsViewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class ColumnsViewTable extends TableImpl<ColumnsViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.table_columns_view</code>
     */
    public static final ColumnsViewTable COLUMNS_VIEW = new ColumnsViewTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnsViewRecord> getRecordType() {
        return ColumnsViewRecord.class;
    }

    /**
     * The column <code>public.table_columns_view.table_catalog</code>.
     */
    public final TableField<ColumnsViewRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.table_schema</code>.
     */
    public final TableField<ColumnsViewRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.table_name</code>.
     */
    public final TableField<ColumnsViewRecord, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.column_name</code>.
     */
    public final TableField<ColumnsViewRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.ordinal_position</code>.
     */
    public final TableField<ColumnsViewRecord, Integer> ORDINAL_POSITION = createField(DSL.name("ordinal_position"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.table_columns_view.column_default</code>.
     */
    public final TableField<ColumnsViewRecord, String> COLUMN_DEFAULT = createField(DSL.name("column_default"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.is_nullable</code>.
     */
    public final TableField<ColumnsViewRecord, String> IS_NULLABLE = createField(DSL.name("is_nullable"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>public.table_columns_view.data_type</code>.
     */
    public final TableField<ColumnsViewRecord, String> DATA_TYPE = createField(DSL.name("data_type"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>public.table_columns_view.character_maximum_length</code>.
     */
    public final TableField<ColumnsViewRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.table_columns_view.character_octet_length</code>.
     */
    public final TableField<ColumnsViewRecord, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.table_columns_view.numeric_precision</code>.
     */
    public final TableField<ColumnsViewRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>public.table_columns_view.numeric_precision_radix</code>.
     */
    public final TableField<ColumnsViewRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.table_columns_view.numeric_scale</code>.
     */
    public final TableField<ColumnsViewRecord, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.table_columns_view.datetime_precision</code>.
     */
    public final TableField<ColumnsViewRecord, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.table_columns_view.interval_type</code>.
     */
    public final TableField<ColumnsViewRecord, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.interval_precision</code>.
     */
    public final TableField<ColumnsViewRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.table_columns_view.character_set_catalog</code>.
     */
    public final TableField<ColumnsViewRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.character_set_schema</code>.
     */
    public final TableField<ColumnsViewRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.character_set_name</code>.
     */
    public final TableField<ColumnsViewRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.collation_catalog</code>.
     */
    public final TableField<ColumnsViewRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.collation_schema</code>.
     */
    public final TableField<ColumnsViewRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.collation_name</code>.
     */
    public final TableField<ColumnsViewRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.domain_catalog</code>.
     */
    public final TableField<ColumnsViewRecord, String> DOMAIN_CATALOG = createField(DSL.name("domain_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.domain_schema</code>.
     */
    public final TableField<ColumnsViewRecord, String> DOMAIN_SCHEMA = createField(DSL.name("domain_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.domain_name</code>.
     */
    public final TableField<ColumnsViewRecord, String> DOMAIN_NAME = createField(DSL.name("domain_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.udt_catalog</code>.
     */
    public final TableField<ColumnsViewRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.udt_schema</code>.
     */
    public final TableField<ColumnsViewRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.udt_name</code>.
     */
    public final TableField<ColumnsViewRecord, String> UDT_NAME = createField(DSL.name("udt_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.scope_catalog</code>.
     */
    public final TableField<ColumnsViewRecord, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.scope_schema</code>.
     */
    public final TableField<ColumnsViewRecord, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.scope_name</code>.
     */
    public final TableField<ColumnsViewRecord, String> SCOPE_NAME = createField(DSL.name("scope_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.maximum_cardinality</code>.
     */
    public final TableField<ColumnsViewRecord, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.table_columns_view.dtd_identifier</code>.
     */
    public final TableField<ColumnsViewRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.is_self_referencing</code>.
     */
    public final TableField<ColumnsViewRecord, String> IS_SELF_REFERENCING = createField(DSL.name("is_self_referencing"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>public.table_columns_view.is_identity</code>.
     */
    public final TableField<ColumnsViewRecord, String> IS_IDENTITY = createField(DSL.name("is_identity"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>public.table_columns_view.identity_generation</code>.
     */
    public final TableField<ColumnsViewRecord, String> IDENTITY_GENERATION = createField(DSL.name("identity_generation"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.identity_start</code>.
     */
    public final TableField<ColumnsViewRecord, String> IDENTITY_START = createField(DSL.name("identity_start"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.identity_increment</code>.
     */
    public final TableField<ColumnsViewRecord, String> IDENTITY_INCREMENT = createField(DSL.name("identity_increment"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.identity_maximum</code>.
     */
    public final TableField<ColumnsViewRecord, String> IDENTITY_MAXIMUM = createField(DSL.name("identity_maximum"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.identity_minimum</code>.
     */
    public final TableField<ColumnsViewRecord, String> IDENTITY_MINIMUM = createField(DSL.name("identity_minimum"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.identity_cycle</code>.
     */
    public final TableField<ColumnsViewRecord, String> IDENTITY_CYCLE = createField(DSL.name("identity_cycle"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>public.table_columns_view.is_generated</code>.
     */
    public final TableField<ColumnsViewRecord, String> IS_GENERATED = createField(DSL.name("is_generated"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.generation_expression</code>.
     */
    public final TableField<ColumnsViewRecord, String> GENERATION_EXPRESSION = createField(DSL.name("generation_expression"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.table_columns_view.is_updatable</code>.
     */
    public final TableField<ColumnsViewRecord, String> IS_UPDATABLE = createField(DSL.name("is_updatable"), SQLDataType.VARCHAR(3), this, "");

    private ColumnsViewTable(Name alias, Table<ColumnsViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private ColumnsViewTable(Name alias, Table<ColumnsViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"table_columns_view\" as  SELECT columns.table_catalog,\n    columns.table_schema,\n    columns.table_name,\n    columns.column_name,\n    columns.ordinal_position,\n    columns.column_default,\n    columns.is_nullable,\n    columns.data_type,\n    columns.character_maximum_length,\n    columns.character_octet_length,\n    columns.numeric_precision,\n    columns.numeric_precision_radix,\n    columns.numeric_scale,\n    columns.datetime_precision,\n    columns.interval_type,\n    columns.interval_precision,\n    columns.character_set_catalog,\n    columns.character_set_schema,\n    columns.character_set_name,\n    columns.collation_catalog,\n    columns.collation_schema,\n    columns.collation_name,\n    columns.domain_catalog,\n    columns.domain_schema,\n    columns.domain_name,\n    columns.udt_catalog,\n    columns.udt_schema,\n    columns.udt_name,\n    columns.scope_catalog,\n    columns.scope_schema,\n    columns.scope_name,\n    columns.maximum_cardinality,\n    columns.dtd_identifier,\n    columns.is_self_referencing,\n    columns.is_identity,\n    columns.identity_generation,\n    columns.identity_start,\n    columns.identity_increment,\n    columns.identity_maximum,\n    columns.identity_minimum,\n    columns.identity_cycle,\n    columns.is_generated,\n    columns.generation_expression,\n    columns.is_updatable\n   FROM information_schema.columns\n  WHERE ((columns.table_schema)::name = 'public'::name);"));
    }

    /**
     * Create an aliased <code>public.table_columns_view</code> table reference
     */
    public ColumnsViewTable(String alias) {
        this(DSL.name(alias), COLUMNS_VIEW);
    }

    /**
     * Create an aliased <code>public.table_columns_view</code> table reference
     */
    public ColumnsViewTable(Name alias) {
        this(alias, COLUMNS_VIEW);
    }

    /**
     * Create a <code>public.table_columns_view</code> table reference
     */
    public ColumnsViewTable() {
        this(DSL.name("table_columns_view"), null);
    }

    public <O extends Record> ColumnsViewTable(Table<O> child, ForeignKey<O, ColumnsViewRecord> key) {
        super(child, key, COLUMNS_VIEW);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public ColumnsViewTable as(String alias) {
        return new ColumnsViewTable(DSL.name(alias), this);
    }

    @Override
    public ColumnsViewTable as(Name alias) {
        return new ColumnsViewTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnsViewTable rename(String name) {
        return new ColumnsViewTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnsViewTable rename(Name name) {
        return new ColumnsViewTable(name, null);
    }
}
