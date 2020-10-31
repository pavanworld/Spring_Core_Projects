package com.nt.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = {"com.nt.dao","com.nt.service"})
public class BusinessConfiguration {
	
	@Bean("hkds")
	public HikariDataSource getDataSource() {
		HikariDataSource hkds=new HikariDataSource();
		hkds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hkds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		hkds.setUsername("system");
		hkds.setPassword("pavan");
		hkds.setMinimumIdle(10);
		hkds.setMaximumPoolSize(30);
		hkds.setMaxLifetime(3000);
		return hkds;
	}

}
