package com.sujata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
@AllArgsConstructor
@Data
@Entity
@Table(name = "EmplJPA")
public class Employee {

	@Id
	private int employeeId;
	private String employeeName;
	
//	@ManyToOne
//	private Project project;
	
}
