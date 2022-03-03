package com.sujata.persistence;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.entity.Employee;
/*
* Return type : Basic Type, Entity  and List<E>
* while writing query we make use of JPAQL (Java Persistence API Query Language)
* JPAQL will be converted to underlying DB by dialect.
* In JPAQL we use class name instead of table name
* and property names instead of column name
* 
*/
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {


	@Transactional
	@Modifying
	@Query("Update Employee set empSalary=:sal where empId=:id")
	int updateEmployeeSalaryById(@Param("id") int empId,@Param("sal") int salary);
	
	@Query("SELECT empName from Employee where empId=:eid")
	public String getNameById(@Param("eid") int id);
	
	@Query("from Employee where empDesignation=:des")
	public List<Employee> getByDesignation(@Param("des") String desig);
	
	@Query("from Employee where empDepartment=?1")
	public List<Employee> getByDepartment(String depart);
}
