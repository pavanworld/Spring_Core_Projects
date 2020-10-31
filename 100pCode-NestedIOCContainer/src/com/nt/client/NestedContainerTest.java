package com.nt.client;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.configuration.BusinessConfiguration;
import com.nt.configuration.MainConfiguration;
import com.nt.configuration.PresentationConfiguration;
import com.nt.controller.EmployeeContoller;
import com.nt.vo.EmployeeVO;


public class NestedContainerTest {
	public static void main(String[] args) {
		List<EmployeeVO> listVO=listVO=new ArrayList<EmployeeVO>();
		EmployeeContoller controller=null;
		
		/*
		 * AnnotationConfigApplicationContext parentctx =new
		 * AnnotationConfigApplicationContext(BusinessConfiguration.class);;
		 * AnnotationConfigApplicationContext childctx=new
		 * AnnotationConfigApplicationContext();; childctx.setParent(parentctx);
		 * childctx.register(PresentationConfiguration.class); childctx.refresh();
		 */
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MainConfiguration.class);
		try {
			controller=ctx.getBean("controller", EmployeeContoller.class);
			listVO=controller.getEmpInfo(1,10);
			ListIterator<EmployeeVO> iterator=listVO.listIterator();
			System.out.println("Serial Number\tId\tName\tDesignation\tDepartment");
			System.out.println("........................................................");
			
			/*
			 * while(iterator.hasNext()) { EmployeeVO vo=iterator.next();
			 * System.out.println(vo.getSerialNumber()+"\t\t"+vo.getId()+"\t"+vo.getName()+
			 * "\t"+ vo.getDesignation()+"\t"+vo.getDepartment()); }
			 */
			//listVO.forEach(vo->System.out.println(vo));
			//listVO.forEach(System.out::println);
			listVO.forEach(vo->{
				System.out.println(vo);
			});
			
			
		}
		catch(Exception e) {
			System.out.println("Some Internal Problem");
			e.printStackTrace();
		}
			
			
	}

}
