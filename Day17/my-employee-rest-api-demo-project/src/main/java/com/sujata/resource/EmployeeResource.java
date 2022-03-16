package com.sujata.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeeList;
import com.sujata.service.EmployeeService;

@RestController
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;
	
	@CrossOrigin
	@GetMapping(path = "/employees/{id}",produces =  MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeByIdResource(@PathVariable("id") int eId) {
		return employeeService.getEmployeeById(eId);
	}
	
	
	@CrossOrigin
	@GetMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeList getAllEmployeeResource(){
		return new EmployeeList(employeeService.getAllEmployees());
	}
	
	@CrossOrigin
	@PostMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee saveEmployeeResource(@RequestBody Employee employee) {
		return employeeService.insertEmployee(employee);
	}
	
	@CrossOrigin
	@DeleteMapping(path = "/employees/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee deleteEmployeeResource(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
	}
}
