package com.sujata.service;

import java.util.List;

import com.sujata.entity.Employee;

public interface EmployeeService {

	Employee getEmployeeById(int id);
	List<Employee> getAllEmployees();
	Employee insertEmployee(Employee employee);
	Employee deleteEmployee(int id);

}
