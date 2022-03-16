package com.sujata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/")
	public String getMainPage() {
		return "mainPage";
	}
//	@RequestMapping("/")
//	public String getMainPage() {
//		return "first";
//	}
}
