package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service()
public class EmployeeManagementServiceImpl implements EmployeeManagementService{
	@Autowired
	private EmployeeDAO dao;

	@Override
	public List<EmployeeDTO> fetchEmployeeInfo(int min,int max) throws Exception {
		List<EmployeeDTO> listDTO=new ArrayList<EmployeeDTO>();
		List<EmployeeBO> listBO=dao.getEmployeeDetails(min,max);
		for(EmployeeBO bo:listBO) {
			EmployeeDTO dto=new EmployeeDTO();
			/*
			 * dto.setId(bo.getId()); dto.setName(bo.getName());
			 * dto.setDepartment(bo.getDepartment());
			 * dto.setDesignation(bo.getDesignation());
			 */
			BeanUtils.copyProperties(bo, dto);
			dto.setSerialNumber(listDTO.size()+1);
			listDTO.add(dto);
		}
		System.out.println(toString());
		return listDTO;
	}

	

}
