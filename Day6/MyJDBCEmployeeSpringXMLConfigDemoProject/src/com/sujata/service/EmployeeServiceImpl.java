package com.sujata.service;

import java.util.List;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePayslip;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

//	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	private EmployeeDao employeeDao;
	
	
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
	super();
	this.employeeDao = employeeDao;
}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.getEmployeeList();
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		int rows=employeeDao.insertRecord(employee);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return employeeDao.getRecordById(id);
	}

	/*
	 * Allowances : 25% of Salary
	 * Deductions :18% of Salary
	 */
	@Override
	public EmployeePayslip generateSalary(int empId) {
		Employee employee=employeeDao.getRecordById(empId);
		if(employee!=null) {
		//Business Logic
		double allowances=employee.getEmpSalary()*.25;
		double deductions=employee.getEmpSalary()*.18;
		double totalSalary=employee.getEmpSalary()+allowances-deductions;
		EmployeePayslip employeePayslip=new EmployeePayslip(employee, allowances, deductions, totalSalary);
			return employeePayslip;
		}
		return null;
	}

}
