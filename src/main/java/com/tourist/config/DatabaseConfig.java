package com.tourist.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages= {"com.tourist"})
@EntityScan(basePackages= {"com.tourist.entity"})
@ComponentScan(basePackages= {"com.tourist"})
@PropertySource("classpath:application.properties")
public class DatabaseConfig {
	
	 @Value("${db.driver}")
	  private String DB_DRIVER;
	  
	  @Value("${db.password}")
	  private String DB_PASSWORD;
	  
	  @Value("${db.url}")
	  private String DB_URL;
	  
	  @Value("${db.username}")
	  private String DB_USERNAME;
	  
	  @Bean(name = "dataSource")
	  public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName(DB_DRIVER);
	    dataSource.setUrl(DB_URL);
	    dataSource.setUsername(DB_USERNAME);
	    dataSource.setPassword(DB_PASSWORD);
	    System.out.println("profile choose " + DB_URL+ "Db driver "+ DB_DRIVER + "username "+ DB_USERNAME + "pass"+ DB_PASSWORD);
	    return dataSource;
	  }

//	  @Value("${hibernate.dialect}")
//	  private String HIBERNATE_DIALECT;
//	  
//	  @Value("${hibernate.show_sql}")
//	  private String HIBERNATE_SHOW_SQL;
//	  
//	  @Value("${hibernate.hbm2ddl.auto}")
//	  private String HIBERNATE_HBM2DDL_AUTO;
//
//	  @Value("${entitymanager.packagesToScan}")
//	  private String ENTITYMANAGER_PACKAGES_TO_SCAN;
	  

	  
//	  @Bean
//	  public LocalSessionFactoryBean sessionFactory() {
//	    LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
//	    sessionFactoryBean.setDataSource(dataSource());
//	    sessionFactoryBean.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
//	    Properties hibernateProperties = new Properties();
//	    hibernateProperties.put("hibernate.dialect", HIBERNATE_DIALECT);
//	    hibernateProperties.put("hibernate.show_sql", HIBERNATE_SHOW_SQL);
//	    hibernateProperties.put("hibernate.hbm2ddl.auto", HIBERNATE_HBM2DDL_AUTO);
//	    sessionFactoryBean.setHibernateProperties(hibernateProperties);
//	    
//	    return sessionFactoryBean;
//	  }
//	  @Bean
//	  public HibernateTransactionManager transactionManager() {
//	    HibernateTransactionManager transactionManager = 
//	        new HibernateTransactionManager();
//	    transactionManager.setSessionFactory(sessionFactory().getObject());
//	    return transactionManager;
//	  }
	  
}
