package com.itshaala.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@AllArgsConstructor
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringConfiguration {


    private Environment env;

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

      /*  dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/isj010");
        dataSource.setUsername("root");
        dataSource.setPassword("root");*/

        //reading from properties file

        dataSource.setDriverClassName(env.getProperty("mysql.db.driver.class"));
        dataSource.setUrl(env.getProperty("mysql.db.url"));
        dataSource.setUsername(env.getProperty("mysql.db.username"));
        dataSource.setPassword(env.getProperty("mysql.db.password"));
        return dataSource;
    }

}
