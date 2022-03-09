package com.sujata.entity;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Employee {

	@Setter
	@Getter
	private int empId;

	@Setter
	@Getter
	private String empName;
	
	@Setter
	@Getter
	private String empDepartment;
	
	@Setter
	@Getter
	private String empDesignation;
	
	@Setter
	@Getter
	private int empSalary;
	
}
