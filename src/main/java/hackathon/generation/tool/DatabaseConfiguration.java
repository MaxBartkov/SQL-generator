package hackathon.generation.tool;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import liquibase.integration.spring.SpringLiquibase;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListener;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class DatabaseConfiguration {

    private final Environment environment;

    @Autowired
    public DatabaseConfiguration(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public DataSource dataSourceConfig() {
        HikariConfig hikariConfig = new HikariConfig();

        hikariConfig.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
        hikariConfig.setJdbcUrl(environment.getProperty("spring.datasource.url"));
        hikariConfig.setUsername(environment.getProperty("spring.datasource.username"));
        hikariConfig.setPassword(environment.getProperty("spring.datasource.password"));
        Properties dataSourceProperties = new Properties();
        hikariConfig.setDataSourceProperties(dataSourceProperties);
        return new HikariDataSource(hikariConfig);
    }

    @Bean
    @DependsOn("dataSourceConfig")
    public SpringLiquibase liquibase(@Qualifier("dataSourceConfig") DataSource dataSourceConfig) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:liquibase-changeLog.xml");
        liquibase.setDataSource(dataSourceConfig);
        return liquibase;
    }


    @Bean
    @DependsOn("dataSourceConfig")
    public DataSourceConnectionProvider connectionProvider(@Qualifier("dataSourceConfig") DataSource dataSourceConfig) {
        return new DataSourceConnectionProvider
                (new TransactionAwareDataSourceProxy(dataSourceConfig));
    }

    @Bean
    @DependsOn("configuration")
    public DefaultDSLContext defaultDSLContext(@Qualifier("configuration") DefaultConfiguration configuration) {
        return new DefaultDSLContext(configuration);
    }

    @Bean
    @DependsOn("connectionProvider")
    public DefaultConfiguration configuration(@Qualifier("connectionProvider") DataSourceConnectionProvider connectionProvider) {
        DefaultConfiguration jooqConfiguration = new DefaultConfiguration();
        jooqConfiguration.set(connectionProvider);
        jooqConfiguration.set(new DefaultExecuteListenerProvider(new DefaultExecuteListener()));
        return jooqConfiguration;
    }
}
