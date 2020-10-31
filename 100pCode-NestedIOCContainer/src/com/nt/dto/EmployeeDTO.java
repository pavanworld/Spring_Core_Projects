package com.nt.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@ToString
@Setter
public class EmployeeDTO implements Serializable {
	private int id;
	private int serialNumber;
	private String name;
	private String department;
	private String designation;
	

}
