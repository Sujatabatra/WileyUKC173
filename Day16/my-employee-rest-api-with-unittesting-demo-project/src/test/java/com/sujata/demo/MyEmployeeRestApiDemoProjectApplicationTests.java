package com.sujata.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sujata.entity.Employee;
import com.sujata.persistence.EmployeeDao;

@SpringBootTest
class MyEmployeeRestApiDemoProjectApplicationTests {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Test
	void contextLoads() {
		Employee employee=new Employee(1, "Abha", "Sales", "Executive", 25000);
//		assertEquals(employeeDao.getById(1).getEmpName(),"Abha" );
		assertThat(employeeDao.getById(1).getEmpName()).isEqualTo("Abha");
		
	}

}
