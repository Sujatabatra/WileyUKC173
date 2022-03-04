package com.sujata.demo;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.entity.Employee;
import com.sujata.entity.Project;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.ProjectDao;

@SpringBootApplication
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class OneToManyMappingProjectApplication implements CommandLineRunner{

	@Autowired
	EmployeeDao employeeDao;
	@Autowired
	ProjectDao projectDao;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToManyMappingProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Employee e1=new Employee(101, "AAAA");
//		Employee e2=new Employee(102, "BBBB");
//		Employee e3=new Employee(103, "CCCC");
//		Employee e4=new Employee(104, "DDDD");
//		Employee e5=new Employee(105, "EEEE");
//		Employee e6=new Employee(106, "FFFF");
//		Employee e7=new Employee(107, "GGGG");
//		Employee e8=new Employee(108, "HHHH");
//		
//		Project p1=new Project("P001","Project A");
//		p1.getEmpList().add(e1);
//		p1.getEmpList().add(e2);
//		p1.getEmpList().add(e7);
//		p1.getEmpList().add(e8);
//		p1.getEmpList().add(e5);
//		
//		Project p2=new Project("P002","Project B");
//		p2.getEmpList().add(e3);
//		p2.getEmpList().add(e4);
//		p2.getEmpList().add(e6);
//		
//		employeeDao.save(e1);
//		employeeDao.save(e2);
//		employeeDao.save(e3);
//		employeeDao.save(e4);
//		employeeDao.save(e5);
//		employeeDao.save(e6);
//		employeeDao.save(e7);
//		employeeDao.save(e8);
//		
//		projectDao.save(p1);
//		projectDao.save(p2);

		Project project=projectDao.getById("P001");
		System.out.println(project.getProjectId()+"  "+project.getProjectName());
		System.out.println("=================================================");
		System.out.println(project.getEmpList());
		
	}

}
