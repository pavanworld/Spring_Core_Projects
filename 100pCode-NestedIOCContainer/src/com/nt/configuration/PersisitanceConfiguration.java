package com.nt.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
@PropertySource(value="com/nt/properties/jdbcproperties.properties")
public class PersisitanceConfiguration {
	@Value("${java.version}")
	private String version;
	@Autowired
	private Environment env;
	
	@Bean("hkds")
	public HikariDataSource getDataSource() {
		System.out.println(version);
		HikariDataSource hkds=new HikariDataSource();
		hkds.setDriverClassName(env.getProperty("jdbc.driver"));
		hkds.setJdbcUrl(env.getProperty("jdbc.url"));
		hkds.setUsername(env.getProperty("jdbc.username"));
		hkds.setPassword(env.getProperty("jdbc.password"));
		hkds.setMinimumIdle(Integer.parseInt(env.getProperty("jdbc.minsize")));
		hkds.setMaximumPoolSize(Integer.parseInt(env.getProperty("jdbc.maxsize")));
		hkds.setMaxLifetime(3000);
		return hkds;
	}

}
