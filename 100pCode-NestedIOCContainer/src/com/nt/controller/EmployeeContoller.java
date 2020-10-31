package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeManagementService;
import com.nt.vo.EmployeeVO;

@Lazy
@Controller("controller")
public class EmployeeContoller {
	@Autowired
	private EmployeeManagementService service;
	
	public List<EmployeeVO> getEmpInfo(int min,int max) throws Exception {
		List<EmployeeVO> listVO=new ArrayList<EmployeeVO>();
		List<EmployeeDTO> listDTO=service.fetchEmployeeInfo(min,max);
		for(EmployeeDTO dto:listDTO) {
			EmployeeVO vo=new EmployeeVO();
			/*
			 * vo.setId(dto.getId()); vo.setName(dto.getName());
			 * vo.setDepartment(dto.getDepartment());
			 * vo.setDesignation(dto.getDesignation());
			 */
			BeanUtils.copyProperties(dto, vo);
			vo.setSerialNumber(String.valueOf(dto.getSerialNumber()));
			listVO.add(vo);
			
		}
		return listVO;
	}
}
