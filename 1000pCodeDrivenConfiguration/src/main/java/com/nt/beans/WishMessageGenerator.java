package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator 0-param");
	}
	
	public String wish(String name) {
		if(date.getHour()<12)
			return "Good Morning::"+name;
		else if(date.getHour()<16)
			return "Good AfterNoon::"+name;
		else if(date.getHour()<20)
			return "Good Evening::"+name;
		else
			return "Good Night::"+name;
	}
	
}
