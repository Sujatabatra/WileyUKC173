package com.sujata.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.entity.Employee;
import com.sujata.model.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public String getMainPageController() {
		return "index";
	}
	
	@RequestMapping("/searchEmployeePage")
	public String getSearchEmployeePage() {
		return "searchEmpPage";
	}
	
	@RequestMapping("/searchEmployee")
	public ModelAndView searchEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		int id=Integer.parseInt(request.getParameter("empId"));
		Employee employee=employeeService.getEmployeeById(id);
		modelAndView.addObject("employee", employee);
		modelAndView.setViewName("showEmployee");
		return modelAndView;
	}
}
