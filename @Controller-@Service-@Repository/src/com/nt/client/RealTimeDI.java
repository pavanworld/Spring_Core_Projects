package com.nt.client;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.control.Controller;
import com.nt.vo.*;
import java.util.Scanner;

public class RealTimeDI {
	private static CustmerVO vo;
	
	public static void main(String[] args) {
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("com/nt/cnfg/applicationContext.xml");
		Controller cntrl=factory.getBean("cntrl",Controller.class);
		vo=new CustmerVO();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Name::");
		vo.setName(s.nextLine());
		System.out.print("Enter Address::");
		vo.setAddr(s.nextLine());
		System.out.print("Enter Amount::");
		vo.setAmt(s.nextLine());
		System.out.print("Enter Rate of Interest::");
		vo.setRate(s.nextLine());
		System.out.print("Enter Time in Months::");
		vo.setTime(s.nextLine());
		try {
			System.out.println(cntrl.processCustmer(vo));
		} catch (Exception e) {
			System.out.println("Some Internal Problem is there Try Later");
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

}
