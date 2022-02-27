package hackathon.generation.tool;

import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.Configuration;
import org.jooq.meta.jaxb.Database;
import org.jooq.meta.jaxb.Generate;
import org.jooq.meta.jaxb.Generator;
import org.jooq.meta.jaxb.Jdbc;
import org.jooq.meta.jaxb.Target;

public class InitializeStructureComponent {

    public static void main(String[] args) throws Exception {
        GenerationTool.generate(buildConfiguration());
    }

    private static Configuration buildConfiguration() {
        return new Configuration()
                .withJdbc(buildJdbcConfiguration())
                .withGenerator(buildGenerator());
    }

    private static Jdbc buildJdbcConfiguration() {
        return new Jdbc().withDriver("org.postgresql.Driver")
                .withUrl("jdbc:postgresql://localhost:5432/postgres")
                .withPassword("root")
                .withUsername("postgres");
    }

    private static Generator buildGenerator() {
        return new Generator()
                .withGenerate(buildGenerate())
                .withDatabase(buildDatabase())
                .withTarget(new Target().withClean(true)
                        .withPackageName("hackathon.generation.tool.model")
                        .withDirectory("src/main/java"));
    }

    private static Generate buildGenerate() {
        return new Generate()
                .withJpaAnnotations(true)
                .withDaos(true);
    }

    private static Database buildDatabase() {
        return new Database()
                .withName("org.jooq.meta.postgres.PostgresDatabase")
                .withIncludes("table_columns_view|foreign_keys_view")
                .withInputSchema("public");
    }
}
