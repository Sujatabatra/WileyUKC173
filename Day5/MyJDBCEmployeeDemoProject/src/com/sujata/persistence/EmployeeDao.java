package com.sujata.persistence;

import java.util.List;

import com.sujata.entity.Employee;


public interface EmployeeDao {

	List<Employee> getEmployeeList();
	int insertRecord(Employee employee);
	Employee getRecordById(int id);
}
