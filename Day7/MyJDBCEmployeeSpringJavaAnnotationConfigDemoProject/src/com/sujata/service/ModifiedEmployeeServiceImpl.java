package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePayslip;
import com.sujata.persistence.EmployeeDao;

//@Component
@Service
public class ModifiedEmployeeServiceImpl extends EmployeeServiceImpl {

	
	public ModifiedEmployeeServiceImpl(@Autowired EmployeeDao employeeDao) {
		super(employeeDao);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Allowances : 40% of Salary
	 * Deductions : 22% of Salary
	 */
	@Override
	public EmployeePayslip generateSalary(int empId) {
		Employee employee=getEmployeeDao().getRecordById(empId);
		if(employee!=null) {
		//Business Logic
		double allowances=employee.getEmpSalary()*.40;
		double deductions=employee.getEmpSalary()*.22;
		double totalSalary=employee.getEmpSalary()+allowances-deductions;
		EmployeePayslip employeePayslip=new EmployeePayslip(employee, allowances, deductions, totalSalary);
			return employeePayslip;
		}
		return null;
	}

}
