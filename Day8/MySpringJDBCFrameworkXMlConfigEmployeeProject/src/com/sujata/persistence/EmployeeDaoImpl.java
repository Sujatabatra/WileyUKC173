package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sujata.entity.Employee;
import com.sujata.util.EmployeeRowMapper;

//@Component("empDao")
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Employee> getEmployeeList() {

		List<Employee> employeeList = new ArrayList<Employee>();
		String query = "SELECT * FROM EMPLOYEE";
		employeeList = jdbcTemplate.query(query, new EmployeeRowMapper());
		return employeeList;
	}

	@Override
	public int insertRecord(Employee employee) {

		String query = "INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)";

		int rows = jdbcTemplate.update(query, employee.getEmpId(), employee.getEmpName(), employee.getEmpDesignation(),
				employee.getEmpDepartment(), employee.getEmpSalary());

		return rows;

	}

	@Override
	public Employee getRecordById(int id) {
		String query = "SELECT * FROM EMPLOYEE WHERE EMPID=?";
		Employee employee = jdbcTemplate.queryForObject(query, new EmployeeRowMapper(), id);
		return employee;
	}

}
