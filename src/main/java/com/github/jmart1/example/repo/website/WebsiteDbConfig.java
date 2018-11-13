package com.github.jmart1.example.repo.website;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "websiteEntityManagerFactory",
        transactionManagerRef = "websiteTransactionManager",
        basePackages = {"net.pacnode.cronservices.repo.website"})
public class WebsiteDbConfig {

    @Bean(name = "websiteJooq")
    public DSLContext dslContext(@Qualifier("websiteDataSource") DataSource ds) {
        return DSL.using(
                ds,
                SQLDialect.MYSQL
        );
    }

    @Bean(name = "websiteDataSource")
    @ConfigurationProperties(prefix = "website.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "websiteEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    barEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("websiteDataSource") DataSource dataSource
    ) {
        return builder
                .dataSource(dataSource)
                .packages("net.pacnode.cronservices.repo.website")
                .persistenceUnit("bar")
                .build();
    }

    @Bean(name = "websiteTransactionManager")
    public PlatformTransactionManager barTransactionManager(
            @Qualifier("websiteEntityManagerFactory") EntityManagerFactory barEntityManagerFactory
    ) {
        return new JpaTransactionManager(barEntityManagerFactory);
    }
}
