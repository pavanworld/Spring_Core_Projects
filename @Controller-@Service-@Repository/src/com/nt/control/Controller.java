package com.nt.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.nt.dto.CustmerDTO;
import com.nt.service.ServiceManagement;
import com.nt.vo.CustmerVO;

@org.springframework.stereotype.Controller("cntrl")
public class Controller {
	private static CustmerVO vo;
	private static CustmerDTO dto;
	@Autowired
	@Qualifier("service")
	private  ServiceManagement service;
	@Value("${id}")
	private  int id;
	  public Controller() {
		  System.out.println("Controller 0-param");
	  }

	public String processCustmer(CustmerVO vo) throws Exception {
		
		dto=new CustmerDTO();
		dto.setName(vo.getName());
		dto.setAddr(vo.getAddr());
		dto.setAmt(Float.parseFloat(vo.getAmt()));
		dto.setRate(Integer.parseInt(vo.getRate()));
		dto.setTime(Integer.parseInt(vo.getTime()));
		System.out.println(id);
		return service.register(dto);
		
	}




}
