package com.nt.control;

import java.util.Date;

@org.springframework.stereotype.Controller()
public class Controller {
	
	public String getMessage(String name) {
		Date date=new Date();
		int hour=date.getHours();
		String result=null;
		if(hour<12)
			result="Good Morning::";
		else if(hour<16)
			result="Good AfterNoon::";
		else if(hour<20)
			result="Good Evening::";
		else
			result="Good Night::";
			
		return result+name;
	}
	
	
	




}
