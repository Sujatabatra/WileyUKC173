package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		
//		EmployeePresentation employeePresentation=new EmployeePresentationImpl();
		
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("com/sujata/client/empl.xml");
		EmployeePresentation employeePresentation=(EmployeePresentation)springContainer.getBean("empPresentation");
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
		}

	}

}
