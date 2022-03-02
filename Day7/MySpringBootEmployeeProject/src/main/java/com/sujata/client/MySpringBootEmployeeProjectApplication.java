package com.sujata.client;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.presentation.EmployeePresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class MySpringBootEmployeeProjectApplication implements CommandLineRunner {

	@Autowired
	private EmployeePresentation employeePresentation;
	
	public static void main(String[] args) {
		/*ApplicationContext springContainer = */SpringApplication.run(MySpringBootEmployeeProjectApplication.class, args);
		/*EmployeePresentation employeePresentation = (EmployeePresentation) springContainer.getBean("empPresentation");

		Scanner scanner = new Scanner(System.in);
		while (true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice = scanner.nextInt();
			employeePresentation.performMenu(choice);
		}*/
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice = scanner.nextInt();
			employeePresentation.performMenu(choice);
		}
		
	}

}
