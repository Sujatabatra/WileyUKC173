package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.producer.Greet;

//@Configuration+@ComponentScan
@SpringBootApplication(scanBasePackages = "com.sujata.producer")
public class MySpringBootGreetProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(MySpringBootGreetProjectApplication.class, args);
		
		Greet greet=(Greet) springContainer.getBean("eve");
		greet.wish();
	}

}
