package com.sujata.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		int eid=resultSet.getInt("EMPID");
		String name=resultSet.getString("EMPNAME");
		String desig=resultSet.getString("DESIGNATION");
		String deptt=resultSet.getString("DEPARTMENT");
		int sal=resultSet.getInt("SALARY");

		Employee employee=new Employee(eid, name, desig, deptt, sal);
		return employee;
	}

}
