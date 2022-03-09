package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

import com.sujata.entity.User;
import com.sujata.model.persistence.UserDao;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.model.persistence")
public class EmployeeSpringbootWebMvcRestclientSessionManagementProjectApplication /*implements CommandLineRunner*/{

//	@Autowired
//	private UserDao userDao;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringbootWebMvcRestclientSessionManagementProjectApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		userDao.save(new User("Sujata","Batra"));
//		userDao.save(new User("Abdul","Rizvi"));
//		userDao.save(new User("Shivam","Faldu"));
//		userDao.save(new User("user1","user123"));
//		
//		
//	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
