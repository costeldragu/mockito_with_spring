package com.mdc.database;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class MySqlConnector {
    private static final DriverManagerDataSource driverManagerDataSource;
    private static final JdbcTemplate jdbcTemplate;

    static {
        Properties props = new Properties();
        try (InputStream in = Files.newInputStream(Paths.get("src/main/resources/database.properties"))) {
            props.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName(props.getProperty("jdbc.driverClassName"));
        driverManagerDataSource.setUrl(props.getProperty("jdbc.url"));
        driverManagerDataSource.setUsername(props.getProperty("jdbc.username"));
        driverManagerDataSource.setPassword(props.getProperty("jdbc.password"));

        jdbcTemplate = new JdbcTemplate(driverManagerDataSource);
    }

    /**
     * Create Driver Manager Data Source
     *
     * @return DriverManagerDataSource
     */
    private DriverManagerDataSource getDriverManager() {
        return driverManagerDataSource;
    }

    /**
     * Get the JdbcTemplate
     *
     * @return JdbcTemplate jdbcTemplate
     */
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

}
