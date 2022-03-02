package com.sujata.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.sujata")
public class EmployeeConfig {

	/*
	 * DriverManagerDataSource is the replacement of JDBC Step 1.1 and 1.2
	 */
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/wileyc173");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("sujata");
		return driverManagerDataSource;
	}
	
	/*
	 * All the JDBC Operation will be performed by JdbcTemplate in Spring Jdbc
	 */
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
}
