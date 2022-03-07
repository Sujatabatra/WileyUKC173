package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sujata.entity.Employee;
import com.sujata.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee getEmployeeById(int id) {

		return employeeDao.getById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee insertEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee deleteEmployee(int id) {
		Employee employee=employeeDao.getById(id);
		employeeDao.deleteById(id);
		return employee;
	}
	
	

}
