package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sujata.entity.Employee;

/*
 * JDBC
 * 1. Connect to DB 
 * 		1.1 Register Driver
 * 		1.2 Connect to DataBase
 * 2. Query
 * 3. Process The result
 * 4. Close the connection
 */
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getEmployeeList() {

		List<Employee> employeeList=new ArrayList<Employee>();
		Connection connection=null;
		try {
//			1. Connect
//			1.1 Register Driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc173", "root", "sujata");
			
//			2. Query
			PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE");
			//to execure all dql statements : executeQUery()
			ResultSet resultSet= preparedStatement.executeQuery();
			
//			3.Process Result
			while(resultSet.next()) {
				int id=resultSet.getInt("EMPID");
				String name=resultSet.getString("EMPNAME");
				String desig=resultSet.getString("DESIGNATION");
				String deptt=resultSet.getString("DEPARTMENT");
				int sal=resultSet.getInt("SALARY");
	
				Employee employee=new Employee(id, name, desig, deptt, sal);
				
				employeeList.add(employee);
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
//			4.Closing the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employeeList;
	}

}
