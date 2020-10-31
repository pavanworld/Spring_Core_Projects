package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.configuration.Configuration;
import com.nt.service.BankLoanServices;
import com.nt.service.BankLoanServices;

public class ReplacerTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Configuration.class);
		BankLoanServices bank=ctx.getBean("bank", BankLoanServices.class);
		System.out.println(bank.getClass());
		System.out.println("Interest is::"+bank.getInterest(10000, 2, 36));
		
	}

}
