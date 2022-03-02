package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
	
	@Getter
	@Setter
	private int empId;
	@Getter
	@Setter
	private String empName;
	@Getter
	@Setter
	private String empDesignation;
	@Getter
	@Setter
	private String empDepartment;
	@Getter
	@Setter
	private int empSalary;
	
//	public Employee() {
//		
//	}
//
//	public Employee(int empId, String empName, String empDesignation, String empDepartment, int empSalary) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.empDesignation = empDesignation;
//		this.empDepartment = empDepartment;
//		this.empSalary = empSalary;
//	}
//
//
//	public int getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//	public String getEmpName() {
//		return empName;
//	}
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//
//	public String getEmpDesignation() {
//		return empDesignation;
//	}
//
//	public void setEmpDesignation(String empDesignation) {
//		this.empDesignation = empDesignation;
//	}
//
//	public String getEmpDepartment() {
//		return empDepartment;
//	}
//
//	public void setEmpDepartment(String empDepartment) {
//		this.empDepartment = empDepartment;
//	}
//
//	public int getEmpSalary() {
//		return empSalary;
//	}
//
//	public void setEmpSalary(int empSalary) {
//		this.empSalary = empSalary;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation
//				+ ", empDepartment=" + empDepartment + ", empSalary=" + empSalary + "]";
//	}
//	
	

}
