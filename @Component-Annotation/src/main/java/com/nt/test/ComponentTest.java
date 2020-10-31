package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.DTDC;
import com.nt.beans.Flightfry;
import com.nt.beans.Flipkart;


public class ComponentTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Flipkart fpkt=ctx.getBean("flipkart",Flipkart.class);
		System.out.println(fpkt.order(new String[] {"chairs","tables"},new float[] {1000,4000}));
		
		Flightfry fry=ctx.getBean("flightfry",Flightfry.class);
		System.out.println(fry);

	}

}
