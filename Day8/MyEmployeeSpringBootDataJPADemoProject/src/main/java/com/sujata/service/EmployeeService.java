package com.sujata.service;

import java.util.List;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePayslip;

public interface EmployeeService {

	List<Employee> getAllEmployee();
	boolean saveEmployee(Employee employee);
	Employee getEmployeeById(int id);
	EmployeePayslip generateSalary(int empId);
	boolean updateEmployee(int id,int salary);
}
