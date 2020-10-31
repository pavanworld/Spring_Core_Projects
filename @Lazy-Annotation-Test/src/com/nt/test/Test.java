package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.comp.Flipkart;


public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/conf/applicationContext.xml");
		//Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		//System.out.println(fpkt.order(new String[] {"chairs","tables"},new float[] {1000,4000}));

	}

}
