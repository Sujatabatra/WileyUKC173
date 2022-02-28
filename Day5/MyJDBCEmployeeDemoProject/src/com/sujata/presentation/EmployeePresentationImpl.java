package com.sujata.presentation;

import java.util.List;

import com.sujata.entity.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

//jdbc:mysql://127.0.0.1:3306/?user=root
public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("===============================");
		System.out.println("1. Show Employees ");
		System.out.println("2. Exit");
		System.out.println("==============================");

	}

	@Override
	public void performMenu(int choice) {
		switch (choice) {
		case 1:
			List<Employee> employeeList=employeeService.getAllEmployee();
			System.out.println("Employee List");
			for(Employee employee:employeeList) {
				System.out.println(employee);
			}
			break;

		case 2:
			System.out.println("Thanks for using Employee Management System!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
