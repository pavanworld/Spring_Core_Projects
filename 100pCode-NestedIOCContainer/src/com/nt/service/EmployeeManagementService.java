package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeManagementService {
	public List<EmployeeDTO> fetchEmployeeInfo(int min,int max)throws Exception;

}
