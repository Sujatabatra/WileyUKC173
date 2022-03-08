package com.sujata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.model.service.Greet;

@Controller
public class MyGreetController {

	@Autowired
	private Greet greet;
	
	@RequestMapping("/greet")
	public ModelAndView myFirstController() {
		ModelAndView modelAndView=new ModelAndView();
		String message=greet.wish();
		modelAndView.addObject("msg", message);
		modelAndView.setViewName("greet");
		return modelAndView;
	}
	
	@RequestMapping("/wish")
	public ModelAndView mySecondController() {
		ModelAndView modelAndView=new ModelAndView();
		String message="Wishing you all a great day ahead!";
		modelAndView.addObject("msg", message);
		modelAndView.setViewName("greet");
		return modelAndView;
	}
}
