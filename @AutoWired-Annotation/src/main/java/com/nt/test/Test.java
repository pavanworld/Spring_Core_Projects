package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;


public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		System.out.println(fpkt.order(new String[] {"chairs","tables"},new float[] {1000,4000}));

	}

}
