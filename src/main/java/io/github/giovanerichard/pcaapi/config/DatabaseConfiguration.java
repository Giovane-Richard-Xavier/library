package io.github.giovanerichard.pcaapi.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.username}")
    String username;
    @Value("${spring.datasource.password}")
    String password;
    @Value("${spring.datasource.driver-class-name}")
    String driver;

    @Bean
    public DataSource dataSource () {
        HikariConfig config = new HikariConfig();
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName(driver);
        config.setJdbcUrl(url);

        config.setMaximumPoolSize(10); // máximo de conexões liberadas
        config.setMinimumIdle(1);   // tamanho inicial do pool
        config.setPoolName("pca-db-pool");
        config.setMaxLifetime(600000); // 10 min
        config.setConnectionTimeout(100000);    // timeout para conseguir uma conexão
        config.setConnectionTestQuery("select 1");  // query de teste

        return new HikariDataSource(config);
    }
}