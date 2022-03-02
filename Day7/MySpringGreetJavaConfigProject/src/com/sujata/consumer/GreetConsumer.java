package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.GoodEvening;
import com.sujata.producer.Greet;

public class GreetConsumer {
/*
 * IOC : Inversion of control : Seperating the depedency logic from the actual business logic of an application
 * We achive IOC with the help of Depedency Injection
 * two kind of depedency injection : constructor injection and setter injection
 */
	public static void main(String[] args) {
		
		ApplicationContext springContainer=new AnnotationConfigApplicationContext(GreetConfig.class);
		
		
		Greet greet1=(Greet)springContainer.getBean("mrng");
		
		greet1.wish();
		System.out.println("greet1 : "+greet1);

		Greet greet2=(Greet)springContainer.getBean("mrng");
		System.out.println("greet2 : "+greet2);
	}

}
