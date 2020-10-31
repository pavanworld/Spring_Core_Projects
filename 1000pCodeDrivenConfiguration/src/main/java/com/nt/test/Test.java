package com.nt.test;

import java.time.LocalDateTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.*;;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Configuration.class);
		WishMessageGenerator wmg=ctx.getBean("wishMessageGenerator", WishMessageGenerator.class);
		System.out.println(wmg.wish("Pavan Janapati"));
		System.out.println(ctx.getBean("time", LocalDateTime.class));
		System.out.println(ctx.getBean("configuration", Configuration.class));
		
	}

}
