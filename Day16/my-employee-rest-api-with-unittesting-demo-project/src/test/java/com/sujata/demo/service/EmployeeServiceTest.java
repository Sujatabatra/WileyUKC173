package com.sujata.demo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sujata.entity.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

//@SpringBootTest
@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

	@Mock
	private EmployeeDao employeeDao;
	
	private EmployeeService employeeService;
	
	@Test
	void testGetEmployeeById() {
		
		employeeService=new EmployeeServiceImpl(employeeDao);
		
		when(employeeDao.getById(1)).thenReturn(new Employee(1,"AAA","Sales","Executive",15000));
		assertThat(employeeService.getEmployeeById(1).getEmpName()).isEqualTo("AAA");
	}

}
