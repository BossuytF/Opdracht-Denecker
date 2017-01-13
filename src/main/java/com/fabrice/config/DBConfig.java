package com.fabrice.config;


import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.fabrice.entities.Apparaat;
import com.fabrice.entities.Werknemer;
import com.fabrice.entities.WerknemerApparaat;


@Configuration 
@EnableTransactionManagement
public class DBConfig {
	
	
		@Bean
		public HibernateTemplate hibernateTemplate() {
			return new HibernateTemplate(sessionFactory());
		}
		
		@Bean
		public SessionFactory sessionFactory() {
			return new LocalSessionFactoryBuilder(getDataSource())
			   .addAnnotatedClasses(Werknemer.class)
			   .addAnnotatedClasses(Apparaat.class)
			   .addAnnotatedClasses(WerknemerApparaat.class)
			   .buildSessionFactory();
		}
		
		@Bean
		public DataSource getDataSource() {
			DriverManagerDataSource  dataSource = new DriverManagerDataSource ();
			dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    dataSource.setUrl("jdbc:sqlserver://127.0.0.1:1433;instanceName=SQLEXPRESS;databaseName=Opdracht 3");
		    dataSource.setUsername("webapp");
		    dataSource.setPassword("azerty");

		    return dataSource;
		}
		
		@Bean
		public HibernateTransactionManager hibTransMan(){
			return new HibernateTransactionManager(sessionFactory());
		}
}



