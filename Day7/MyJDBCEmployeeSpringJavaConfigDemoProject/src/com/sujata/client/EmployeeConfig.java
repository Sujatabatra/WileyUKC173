package com.sujata.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;
import com.sujata.presentation.EmployeePresentationImpl;
import com.sujata.service.EmployeeServiceImpl;
import com.sujata.service.ModifiedEmployeeServiceImpl;

@Configuration
public class EmployeeConfig {
	
	@Bean("empDao")
	public EmployeeDaoImpl getEmployeeDao() {
		return new EmployeeDaoImpl();
	}
	
	@Bean
	public EmployeeServiceImpl empService() {
		return new EmployeeServiceImpl(getEmployeeDao());
	}
	
	@Bean
	public ModifiedEmployeeServiceImpl modifiedEmpService() {
		return new ModifiedEmployeeServiceImpl(getEmployeeDao());
	}
	
	@Bean
	public EmployeePresentationImpl empPresentation() {
		
		EmployeePresentationImpl employeePresentationImpl=new EmployeePresentationImpl();
		employeePresentationImpl.setEmployeeService(empService());
		return employeePresentationImpl;
		
	}

}
