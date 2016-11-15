package com.roomsbooking.Configuration;

import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.roomsbooking.Objects.Room;
import com.roomsbooking.Objects.User;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.roomsbooking" })
//@PropertySource("classpath:com/roomsbooking/Configuration/config.properties")

public class ApplicationConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/RoomBooking?createDatabaseIfNotExist=true");
		dataSource.setUsername("postgres");
		dataSource.setPassword("chaitu465");

		return dataSource;
	}

//	@Bean(name = "sessionFactory")
//	public SessionFactory getSessionFactory(DataSource dataSource) {
//
//		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
//
//		sessionBuilder.addAnnotatedClasses(User.class);
//		sessionBuilder.addAnnotatedClasses(Room.class);
//
//		return sessionBuilder.buildSessionFactory();
//	}

	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		return properties;
	}

//	@Bean
//	public HibernateTransactionManager transactionManager(SessionFactory s) {
//		HibernateTransactionManager txManager = new HibernateTransactionManager();
//		txManager.setSessionFactory(s);
//		return txManager;
//	}

}
