package com.example.nodo_training_webservice_10.service;

import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.yaml.snakeyaml.constructor.Constructor;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableWebMvc
@PropertySource("classpath:/application.properties")
public class AppConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private org.springframework.core.env.Environment env;

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        super.configureDefaultServletHandling(configurer);
    }
    @Bean
    public DataSource dataSource(){
        String url =env.getProperty("jdbc.url");
        DriverManagerDataSource dataSource = new DriverManagerDataSource(url);
//        dataSource.setDriverClassName("spring.datasource.driver-class-name");
        dataSource.setUsername("spring.datasource.username");
        dataSource.setPassword("spring.datasource.password");
        return dataSource;
    }
    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactory= new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan("com.example.nodo_training_webservice_10/model");
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }
    private Properties hibernateProperties(){
        return new Properties(){
            {
                setProperty("spring.jpa.show-sql", env.getProperty("spring.jpa.show-sql"));
                setProperty("spring.jooq.sql-dialect", env.getProperty("spring.jooq.sql-dialect"));
            }
        };
    }
}
