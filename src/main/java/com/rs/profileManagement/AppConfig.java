package com.rs.profileManagement;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.rs.profileManagement.Utility.DBProperty;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableWebMvc
@EnableAsync
public class AppConfig {
	
	
	@Bean
	public DataSource getDataSource(DBProperty dbproperty) {
		HikariDataSource dataSourceBuilder= new HikariDataSource();
		dataSourceBuilder.setJdbcUrl(dbproperty.getUrl());
		dataSourceBuilder.setUsername(dbproperty.getUsername());
		dataSourceBuilder.setPassword(dbproperty.getPassword());
		return dataSourceBuilder;
	}
	
}
