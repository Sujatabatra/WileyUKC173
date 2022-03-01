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

	@Override
	public int insertRecord(Employee employee) {
		Connection connection=null;
		try {
//			1. Connect
//			1.1 Register Driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc173", "root", "sujata");
			
//			2. Query
			PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");
			preparedStatement.setInt(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpName());
			preparedStatement.setString(3,employee.getEmpDesignation());
			preparedStatement.setString(4, employee.getEmpDepartment());
			preparedStatement.setInt(5, employee.getEmpSalary());
			
			//to execure all dml statements(insert, delete,update) : executeUpdate()
			int rows= preparedStatement.executeUpdate();
			
//			3.Process Result
			
			return rows;
			
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

		return 0;
	}

	@Override
	public Employee getRecordById(int id) {
		Employee employee=null;
		Connection connection=null;
		try {
//			1. Connect
//			1.1 Register Driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc173", "root", "sujata");
			
//			2. Query
			PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE EMPID=?");
			preparedStatement.setInt(1, id);
			
			//to execure all dql statements : executeQUery()
			ResultSet resultSet= preparedStatement.executeQuery();
			
//			3.Process Result
			if(resultSet.next()) {
				int eid=resultSet.getInt("EMPID");
				String name=resultSet.getString("EMPNAME");
				String desig=resultSet.getString("DESIGNATION");
				String deptt=resultSet.getString("DEPARTMENT");
				int sal=resultSet.getInt("SALARY");
	
				employee=new Employee(eid, name, desig, deptt, sal);
				
				
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

		return employee;
	}

}
