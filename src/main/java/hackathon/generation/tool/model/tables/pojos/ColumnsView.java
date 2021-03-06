/*
 * This file is generated by jOOQ.
 */
package hackathon.generation.tool.model.tables.pojos;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnsView implements Serializable {

    private static final long serialVersionUID = 1L;

    private String  tableCatalog;
    private String  tableSchema;
    private String  tableName;
    private String  columnName;
    private Integer ordinalPosition;
    private String  columnDefault;
    private String  isNullable;
    private String  dataType;
    private Integer characterMaximumLength;
    private Integer characterOctetLength;
    private Integer numericPrecision;
    private Integer numericPrecisionRadix;
    private Integer numericScale;
    private Integer datetimePrecision;
    private String  intervalType;
    private Integer intervalPrecision;
    private String  characterSetCatalog;
    private String  characterSetSchema;
    private String  characterSetName;
    private String  collationCatalog;
    private String  collationSchema;
    private String  collationName;
    private String  domainCatalog;
    private String  domainSchema;
    private String  domainName;
    private String  udtCatalog;
    private String  udtSchema;
    private String  udtName;
    private String  scopeCatalog;
    private String  scopeSchema;
    private String  scopeName;
    private Integer maximumCardinality;
    private String  dtdIdentifier;
    private String  isSelfReferencing;
    private String  isIdentity;
    private String  identityGeneration;
    private String  identityStart;
    private String  identityIncrement;
    private String  identityMaximum;
    private String  identityMinimum;
    private String  identityCycle;
    private String  isGenerated;
    private String  generationExpression;
    private String  isUpdatable;

    public ColumnsView() {}

    public ColumnsView(ColumnsView value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.columnName = value.columnName;
        this.ordinalPosition = value.ordinalPosition;
        this.columnDefault = value.columnDefault;
        this.isNullable = value.isNullable;
        this.dataType = value.dataType;
        this.characterMaximumLength = value.characterMaximumLength;
        this.characterOctetLength = value.characterOctetLength;
        this.numericPrecision = value.numericPrecision;
        this.numericPrecisionRadix = value.numericPrecisionRadix;
        this.numericScale = value.numericScale;
        this.datetimePrecision = value.datetimePrecision;
        this.intervalType = value.intervalType;
        this.intervalPrecision = value.intervalPrecision;
        this.characterSetCatalog = value.characterSetCatalog;
        this.characterSetSchema = value.characterSetSchema;
        this.characterSetName = value.characterSetName;
        this.collationCatalog = value.collationCatalog;
        this.collationSchema = value.collationSchema;
        this.collationName = value.collationName;
        this.domainCatalog = value.domainCatalog;
        this.domainSchema = value.domainSchema;
        this.domainName = value.domainName;
        this.udtCatalog = value.udtCatalog;
        this.udtSchema = value.udtSchema;
        this.udtName = value.udtName;
        this.scopeCatalog = value.scopeCatalog;
        this.scopeSchema = value.scopeSchema;
        this.scopeName = value.scopeName;
        this.maximumCardinality = value.maximumCardinality;
        this.dtdIdentifier = value.dtdIdentifier;
        this.isSelfReferencing = value.isSelfReferencing;
        this.isIdentity = value.isIdentity;
        this.identityGeneration = value.identityGeneration;
        this.identityStart = value.identityStart;
        this.identityIncrement = value.identityIncrement;
        this.identityMaximum = value.identityMaximum;
        this.identityMinimum = value.identityMinimum;
        this.identityCycle = value.identityCycle;
        this.isGenerated = value.isGenerated;
        this.generationExpression = value.generationExpression;
        this.isUpdatable = value.isUpdatable;
    }

    public ColumnsView(
        String  tableCatalog,
        String  tableSchema,
        String  tableName,
        String  columnName,
        Integer ordinalPosition,
        String  columnDefault,
        String  isNullable,
        String  dataType,
        Integer characterMaximumLength,
        Integer characterOctetLength,
        Integer numericPrecision,
        Integer numericPrecisionRadix,
        Integer numericScale,
        Integer datetimePrecision,
        String  intervalType,
        Integer intervalPrecision,
        String  characterSetCatalog,
        String  characterSetSchema,
        String  characterSetName,
        String  collationCatalog,
        String  collationSchema,
        String  collationName,
        String  domainCatalog,
        String  domainSchema,
        String  domainName,
        String  udtCatalog,
        String  udtSchema,
        String  udtName,
        String  scopeCatalog,
        String  scopeSchema,
        String  scopeName,
        Integer maximumCardinality,
        String  dtdIdentifier,
        String  isSelfReferencing,
        String  isIdentity,
        String  identityGeneration,
        String  identityStart,
        String  identityIncrement,
        String  identityMaximum,
        String  identityMinimum,
        String  identityCycle,
        String  isGenerated,
        String  generationExpression,
        String  isUpdatable
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.columnName = columnName;
        this.ordinalPosition = ordinalPosition;
        this.columnDefault = columnDefault;
        this.isNullable = isNullable;
        this.dataType = dataType;
        this.characterMaximumLength = characterMaximumLength;
        this.characterOctetLength = characterOctetLength;
        this.numericPrecision = numericPrecision;
        this.numericPrecisionRadix = numericPrecisionRadix;
        this.numericScale = numericScale;
        this.datetimePrecision = datetimePrecision;
        this.intervalType = intervalType;
        this.intervalPrecision = intervalPrecision;
        this.characterSetCatalog = characterSetCatalog;
        this.characterSetSchema = characterSetSchema;
        this.characterSetName = characterSetName;
        this.collationCatalog = collationCatalog;
        this.collationSchema = collationSchema;
        this.collationName = collationName;
        this.domainCatalog = domainCatalog;
        this.domainSchema = domainSchema;
        this.domainName = domainName;
        this.udtCatalog = udtCatalog;
        this.udtSchema = udtSchema;
        this.udtName = udtName;
        this.scopeCatalog = scopeCatalog;
        this.scopeSchema = scopeSchema;
        this.scopeName = scopeName;
        this.maximumCardinality = maximumCardinality;
        this.dtdIdentifier = dtdIdentifier;
        this.isSelfReferencing = isSelfReferencing;
        this.isIdentity = isIdentity;
        this.identityGeneration = identityGeneration;
        this.identityStart = identityStart;
        this.identityIncrement = identityIncrement;
        this.identityMaximum = identityMaximum;
        this.identityMinimum = identityMinimum;
        this.identityCycle = identityCycle;
        this.isGenerated = isGenerated;
        this.generationExpression = generationExpression;
        this.isUpdatable = isUpdatable;
    }

    /**
     * Getter for <code>public.table_columns_view.table_catalog</code>.
     */
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Setter for <code>public.table_columns_view.table_catalog</code>.
     */
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    /**
     * Getter for <code>public.table_columns_view.table_schema</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Setter for <code>public.table_columns_view.table_schema</code>.
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * Getter for <code>public.table_columns_view.table_name</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Setter for <code>public.table_columns_view.table_name</code>.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * Getter for <code>public.table_columns_view.column_name</code>.
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * Setter for <code>public.table_columns_view.column_name</code>.
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Getter for <code>public.table_columns_view.ordinal_position</code>.
     */
    public Integer getOrdinalPosition() {
        return this.ordinalPosition;
    }

    /**
     * Setter for <code>public.table_columns_view.ordinal_position</code>.
     */
    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    /**
     * Getter for <code>public.table_columns_view.column_default</code>.
     */
    public String getColumnDefault() {
        return this.columnDefault;
    }

    /**
     * Setter for <code>public.table_columns_view.column_default</code>.
     */
    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
    }

    /**
     * Getter for <code>public.table_columns_view.is_nullable</code>.
     */
    public String getIsNullable() {
        return this.isNullable;
    }

    /**
     * Setter for <code>public.table_columns_view.is_nullable</code>.
     */
    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
    }

    /**
     * Getter for <code>public.table_columns_view.data_type</code>.
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * Setter for <code>public.table_columns_view.data_type</code>.
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * Getter for
     * <code>public.table_columns_view.character_maximum_length</code>.
     */
    public Integer getCharacterMaximumLength() {
        return this.characterMaximumLength;
    }

    /**
     * Setter for
     * <code>public.table_columns_view.character_maximum_length</code>.
     */
    public void setCharacterMaximumLength(Integer characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    /**
     * Getter for <code>public.table_columns_view.character_octet_length</code>.
     */
    public Integer getCharacterOctetLength() {
        return this.characterOctetLength;
    }

    /**
     * Setter for <code>public.table_columns_view.character_octet_length</code>.
     */
    public void setCharacterOctetLength(Integer characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    /**
     * Getter for <code>public.table_columns_view.numeric_precision</code>.
     */
    public Integer getNumericPrecision() {
        return this.numericPrecision;
    }

    /**
     * Setter for <code>public.table_columns_view.numeric_precision</code>.
     */
    public void setNumericPrecision(Integer numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    /**
     * Getter for
     * <code>public.table_columns_view.numeric_precision_radix</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return this.numericPrecisionRadix;
    }

    /**
     * Setter for
     * <code>public.table_columns_view.numeric_precision_radix</code>.
     */
    public void setNumericPrecisionRadix(Integer numericPrecisionRadix) {
        this.numericPrecisionRadix = numericPrecisionRadix;
    }

    /**
     * Getter for <code>public.table_columns_view.numeric_scale</code>.
     */
    public Integer getNumericScale() {
        return this.numericScale;
    }

    /**
     * Setter for <code>public.table_columns_view.numeric_scale</code>.
     */
    public void setNumericScale(Integer numericScale) {
        this.numericScale = numericScale;
    }

    /**
     * Getter for <code>public.table_columns_view.datetime_precision</code>.
     */
    public Integer getDatetimePrecision() {
        return this.datetimePrecision;
    }

    /**
     * Setter for <code>public.table_columns_view.datetime_precision</code>.
     */
    public void setDatetimePrecision(Integer datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    /**
     * Getter for <code>public.table_columns_view.interval_type</code>.
     */
    public String getIntervalType() {
        return this.intervalType;
    }

    /**
     * Setter for <code>public.table_columns_view.interval_type</code>.
     */
    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType;
    }

    /**
     * Getter for <code>public.table_columns_view.interval_precision</code>.
     */
    public Integer getIntervalPrecision() {
        return this.intervalPrecision;
    }

    /**
     * Setter for <code>public.table_columns_view.interval_precision</code>.
     */
    public void setIntervalPrecision(Integer intervalPrecision) {
        this.intervalPrecision = intervalPrecision;
    }

    /**
     * Getter for <code>public.table_columns_view.character_set_catalog</code>.
     */
    public String getCharacterSetCatalog() {
        return this.characterSetCatalog;
    }

    /**
     * Setter for <code>public.table_columns_view.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(String characterSetCatalog) {
        this.characterSetCatalog = characterSetCatalog;
    }

    /**
     * Getter for <code>public.table_columns_view.character_set_schema</code>.
     */
    public String getCharacterSetSchema() {
        return this.characterSetSchema;
    }

    /**
     * Setter for <code>public.table_columns_view.character_set_schema</code>.
     */
    public void setCharacterSetSchema(String characterSetSchema) {
        this.characterSetSchema = characterSetSchema;
    }

    /**
     * Getter for <code>public.table_columns_view.character_set_name</code>.
     */
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * Setter for <code>public.table_columns_view.character_set_name</code>.
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * Getter for <code>public.table_columns_view.collation_catalog</code>.
     */
    public String getCollationCatalog() {
        return this.collationCatalog;
    }

    /**
     * Setter for <code>public.table_columns_view.collation_catalog</code>.
     */
    public void setCollationCatalog(String collationCatalog) {
        this.collationCatalog = collationCatalog;
    }

    /**
     * Getter for <code>public.table_columns_view.collation_schema</code>.
     */
    public String getCollationSchema() {
        return this.collationSchema;
    }

    /**
     * Setter for <code>public.table_columns_view.collation_schema</code>.
     */
    public void setCollationSchema(String collationSchema) {
        this.collationSchema = collationSchema;
    }

    /**
     * Getter for <code>public.table_columns_view.collation_name</code>.
     */
    public String getCollationName() {
        return this.collationName;
    }

    /**
     * Setter for <code>public.table_columns_view.collation_name</code>.
     */
    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    /**
     * Getter for <code>public.table_columns_view.domain_catalog</code>.
     */
    public String getDomainCatalog() {
        return this.domainCatalog;
    }

    /**
     * Setter for <code>public.table_columns_view.domain_catalog</code>.
     */
    public void setDomainCatalog(String domainCatalog) {
        this.domainCatalog = domainCatalog;
    }

    /**
     * Getter for <code>public.table_columns_view.domain_schema</code>.
     */
    public String getDomainSchema() {
        return this.domainSchema;
    }

    /**
     * Setter for <code>public.table_columns_view.domain_schema</code>.
     */
    public void setDomainSchema(String domainSchema) {
        this.domainSchema = domainSchema;
    }

    /**
     * Getter for <code>public.table_columns_view.domain_name</code>.
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * Setter for <code>public.table_columns_view.domain_name</code>.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * Getter for <code>public.table_columns_view.udt_catalog</code>.
     */
    public String getUdtCatalog() {
        return this.udtCatalog;
    }

    /**
     * Setter for <code>public.table_columns_view.udt_catalog</code>.
     */
    public void setUdtCatalog(String udtCatalog) {
        this.udtCatalog = udtCatalog;
    }

    /**
     * Getter for <code>public.table_columns_view.udt_schema</code>.
     */
    public String getUdtSchema() {
        return this.udtSchema;
    }

    /**
     * Setter for <code>public.table_columns_view.udt_schema</code>.
     */
    public void setUdtSchema(String udtSchema) {
        this.udtSchema = udtSchema;
    }

    /**
     * Getter for <code>public.table_columns_view.udt_name</code>.
     */
    public String getUdtName() {
        return this.udtName;
    }

    /**
     * Setter for <code>public.table_columns_view.udt_name</code>.
     */
    public void setUdtName(String udtName) {
        this.udtName = udtName;
    }

    /**
     * Getter for <code>public.table_columns_view.scope_catalog</code>.
     */
    public String getScopeCatalog() {
        return this.scopeCatalog;
    }

    /**
     * Setter for <code>public.table_columns_view.scope_catalog</code>.
     */
    public void setScopeCatalog(String scopeCatalog) {
        this.scopeCatalog = scopeCatalog;
    }

    /**
     * Getter for <code>public.table_columns_view.scope_schema</code>.
     */
    public String getScopeSchema() {
        return this.scopeSchema;
    }

    /**
     * Setter for <code>public.table_columns_view.scope_schema</code>.
     */
    public void setScopeSchema(String scopeSchema) {
        this.scopeSchema = scopeSchema;
    }

    /**
     * Getter for <code>public.table_columns_view.scope_name</code>.
     */
    public String getScopeName() {
        return this.scopeName;
    }

    /**
     * Setter for <code>public.table_columns_view.scope_name</code>.
     */
    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    /**
     * Getter for <code>public.table_columns_view.maximum_cardinality</code>.
     */
    public Integer getMaximumCardinality() {
        return this.maximumCardinality;
    }

    /**
     * Setter for <code>public.table_columns_view.maximum_cardinality</code>.
     */
    public void setMaximumCardinality(Integer maximumCardinality) {
        this.maximumCardinality = maximumCardinality;
    }

    /**
     * Getter for <code>public.table_columns_view.dtd_identifier</code>.
     */
    public String getDtdIdentifier() {
        return this.dtdIdentifier;
    }

    /**
     * Setter for <code>public.table_columns_view.dtd_identifier</code>.
     */
    public void setDtdIdentifier(String dtdIdentifier) {
        this.dtdIdentifier = dtdIdentifier;
    }

    /**
     * Getter for <code>public.table_columns_view.is_self_referencing</code>.
     */
    public String getIsSelfReferencing() {
        return this.isSelfReferencing;
    }

    /**
     * Setter for <code>public.table_columns_view.is_self_referencing</code>.
     */
    public void setIsSelfReferencing(String isSelfReferencing) {
        this.isSelfReferencing = isSelfReferencing;
    }

    /**
     * Getter for <code>public.table_columns_view.is_identity</code>.
     */
    public String getIsIdentity() {
        return this.isIdentity;
    }

    /**
     * Setter for <code>public.table_columns_view.is_identity</code>.
     */
    public void setIsIdentity(String isIdentity) {
        this.isIdentity = isIdentity;
    }

    /**
     * Getter for <code>public.table_columns_view.identity_generation</code>.
     */
    public String getIdentityGeneration() {
        return this.identityGeneration;
    }

    /**
     * Setter for <code>public.table_columns_view.identity_generation</code>.
     */
    public void setIdentityGeneration(String identityGeneration) {
        this.identityGeneration = identityGeneration;
    }

    /**
     * Getter for <code>public.table_columns_view.identity_start</code>.
     */
    public String getIdentityStart() {
        return this.identityStart;
    }

    /**
     * Setter for <code>public.table_columns_view.identity_start</code>.
     */
    public void setIdentityStart(String identityStart) {
        this.identityStart = identityStart;
    }

    /**
     * Getter for <code>public.table_columns_view.identity_increment</code>.
     */
    public String getIdentityIncrement() {
        return this.identityIncrement;
    }

    /**
     * Setter for <code>public.table_columns_view.identity_increment</code>.
     */
    public void setIdentityIncrement(String identityIncrement) {
        this.identityIncrement = identityIncrement;
    }

    /**
     * Getter for <code>public.table_columns_view.identity_maximum</code>.
     */
    public String getIdentityMaximum() {
        return this.identityMaximum;
    }

    /**
     * Setter for <code>public.table_columns_view.identity_maximum</code>.
     */
    public void setIdentityMaximum(String identityMaximum) {
        this.identityMaximum = identityMaximum;
    }

    /**
     * Getter for <code>public.table_columns_view.identity_minimum</code>.
     */
    public String getIdentityMinimum() {
        return this.identityMinimum;
    }

    /**
     * Setter for <code>public.table_columns_view.identity_minimum</code>.
     */
    public void setIdentityMinimum(String identityMinimum) {
        this.identityMinimum = identityMinimum;
    }

    /**
     * Getter for <code>public.table_columns_view.identity_cycle</code>.
     */
    public String getIdentityCycle() {
        return this.identityCycle;
    }

    /**
     * Setter for <code>public.table_columns_view.identity_cycle</code>.
     */
    public void setIdentityCycle(String identityCycle) {
        this.identityCycle = identityCycle;
    }

    /**
     * Getter for <code>public.table_columns_view.is_generated</code>.
     */
    //@Column(name = "is_generated")
    public String getIsGenerated() {
        return this.isGenerated;
    }

    /**
     * Setter for <code>public.table_columns_view.is_generated</code>.
     */
    public void setIsGenerated(String isGenerated) {
        this.isGenerated = isGenerated;
    }

    /**
     * Getter for <code>public.table_columns_view.generation_expression</code>.
     */
    public String getGenerationExpression() {
        return this.generationExpression;
    }

    /**
     * Setter for <code>public.table_columns_view.generation_expression</code>.
     */
    public void setGenerationExpression(String generationExpression) {
        this.generationExpression = generationExpression;
    }

    /**
     * Getter for <code>public.table_columns_view.is_updatable</code>.
     */
    public String getIsUpdatable() {
        return this.isUpdatable;
    }

    /**
     * Setter for <code>public.table_columns_view.is_updatable</code>.
     */
    public void setIsUpdatable(String isUpdatable) {
        this.isUpdatable = isUpdatable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TableColumnsView (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(columnName);
        sb.append(", ").append(ordinalPosition);
        sb.append(", ").append(columnDefault);
        sb.append(", ").append(isNullable);
        sb.append(", ").append(dataType);
        sb.append(", ").append(characterMaximumLength);
        sb.append(", ").append(characterOctetLength);
        sb.append(", ").append(numericPrecision);
        sb.append(", ").append(numericPrecisionRadix);
        sb.append(", ").append(numericScale);
        sb.append(", ").append(datetimePrecision);
        sb.append(", ").append(intervalType);
        sb.append(", ").append(intervalPrecision);
        sb.append(", ").append(characterSetCatalog);
        sb.append(", ").append(characterSetSchema);
        sb.append(", ").append(characterSetName);
        sb.append(", ").append(collationCatalog);
        sb.append(", ").append(collationSchema);
        sb.append(", ").append(collationName);
        sb.append(", ").append(domainCatalog);
        sb.append(", ").append(domainSchema);
        sb.append(", ").append(domainName);
        sb.append(", ").append(udtCatalog);
        sb.append(", ").append(udtSchema);
        sb.append(", ").append(udtName);
        sb.append(", ").append(scopeCatalog);
        sb.append(", ").append(scopeSchema);
        sb.append(", ").append(scopeName);
        sb.append(", ").append(maximumCardinality);
        sb.append(", ").append(dtdIdentifier);
        sb.append(", ").append(isSelfReferencing);
        sb.append(", ").append(isIdentity);
        sb.append(", ").append(identityGeneration);
        sb.append(", ").append(identityStart);
        sb.append(", ").append(identityIncrement);
        sb.append(", ").append(identityMaximum);
        sb.append(", ").append(identityMinimum);
        sb.append(", ").append(identityCycle);
        sb.append(", ").append(isGenerated);
        sb.append(", ").append(generationExpression);
        sb.append(", ").append(isUpdatable);

        sb.append(")");
        return sb.toString();
    }
}
