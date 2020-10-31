package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.control.Controller;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		System.out.println("SpringBootAppApplication.main()");
		ApplicationContext ctx=SpringApplication.run(SpringBootAppApplication.class, args);
		Controller ct=ctx.getBean("controller", Controller.class);
		System.out.println(ct.getMessage("Pavan"));
	}

}
