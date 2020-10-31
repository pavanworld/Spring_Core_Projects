package com.nt.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nt.bo.CustmerBO;
import com.nt.dao.CustmerDAO;
import com.nt.dto.CustmerDTO;
@Service("service")
public class ServiceManagementImpl implements ServiceManagement{
	
	private CustmerBO bo;
	@Autowired
	@Qualifier("oradao")
	private CustmerDAO dao;
	
	public ServiceManagementImpl() {
		System.out.println("ServiceManagementImpl 0-param");
		
	}

	@Override
	public String register(CustmerDTO dto) throws Exception {
		
		float interest=(dto.getAmt()*dto.getRate()*dto.getTime())/100.0f;
		CustmerBO bo=new CustmerBO();
		bo.setInterest(interest);
		bo.setName(dto.getName());
		bo.setAmt(dto.getAmt());	
		bo.setAddr(dto.getAddr());
		
		
		
		return (dao.insert(bo)==1)?"Object is Stored "+bo.getName()+" "+bo.getAddr()+" "+bo.getAmt()+" "+bo.getInterest():"";
	}

}
