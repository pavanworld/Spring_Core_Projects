package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = {"com.nt.beans","com.nt.xxx"})
public class Configuration {
	
	@Bean("time")
	public LocalDateTime getLocalDateTime(){
		System.out.println("Configuration.getLocalDateTime()  -->"+getClass());
		return LocalDateTime.now();
	}
	

}
