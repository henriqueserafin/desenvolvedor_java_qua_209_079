package com.crud.app;

// import org.hibernate.Hibernate;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


@Configuration
public class DataConfig {
    @Bean
    public DataSource DataSource(){  
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/db_java");
        dataSource.setUsername("root");
        dataSource.setPassword("1234h");
        //FIXME - 
        return dataSource;
        //return DataSource();
    }
    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true);
        //FIXME - 
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
        //adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
        adapter.setPrepareConnection(true);

        return adapter;
    }

}