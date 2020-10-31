package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	
	public List<EmployeeBO> getEmployeeDetails(int min,int max)throws Exception;

}
