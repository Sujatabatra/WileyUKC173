package com.sujata.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeeList;

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

	@Override
	public List<Employee> getAllEmployees() {
		return restTemplate.getForObject("http://localhost:8085/employees", EmployeeList.class).getEmpList();
	}

	@Override
	public boolean deleteEmployeeById(int id) {
		HttpHeaders header=new HttpHeaders();
		HttpEntity<Employee> entity=new HttpEntity<Employee>(header);
		Employee employee=restTemplate.exchange("http://localhost:8085/employees/"+id,HttpMethod.DELETE, entity, Employee.class).getBody();
		if(employee!=null)
			return true;
		return false;
	}

}
