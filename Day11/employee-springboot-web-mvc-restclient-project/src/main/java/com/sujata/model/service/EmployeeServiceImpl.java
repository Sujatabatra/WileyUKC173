package com.sujata.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Employee getEmployeeById(int id) {
		return restTemplate.getForObject("http://localhost:8085/employees/"+id, Employee.class);
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		Employee emp=restTemplate.postForObject("http://localhost:8085/employees", employee, Employee.class);
		if(emp!=null)
			return true;
		return false;
	}

}
