package com.sujata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {

	@Setter
	@Getter
	@Id
	private int empId;
	@Setter
	@Getter
	private String empName;
	
	@Setter
	@Getter
	@Column(name = "department")
	private String empDepartment;
	
	@Setter
	@Getter
	@Column(name = "designation")
	private String empDesignation;
	
	@Setter
	@Getter
	@Column(name = "salary")
	private int empSalary;
	
}
