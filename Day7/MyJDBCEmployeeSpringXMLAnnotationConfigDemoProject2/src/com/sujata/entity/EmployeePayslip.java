package com.sujata.entity;

public class EmployeePayslip {
	
	private Employee employee;
	private double allowances;
	private double deductions;
	private double totalSalary;
	
	public EmployeePayslip() {
		
	}

	public EmployeePayslip(Employee employee, double allowances, double deductions, double totalSalary) {
		super();
		this.employee = employee;
		this.allowances = allowances;
		this.deductions = deductions;
		this.totalSalary = totalSalary;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public double getAllowances() {
		return allowances;
	}

	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}

	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	@Override
	public String toString() {
		return "EmployeePayslip [employee=" + employee + ", allowances=" + allowances + ", deductions=" + deductions
				+ ", totalSalary=" + totalSalary + "]";
	}
	
	

}
