package com.sujata.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.entity.User;
import com.sujata.model.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/")
	public ModelAndView getLoginPage() {
		return new ModelAndView("loginPage", "usr", new User());
	}
	
	@RequestMapping("/loginCheck")
	public ModelAndView loginCheckController(@ModelAttribute("usr") User user,HttpSession session) {
		ModelAndView modelAndView=new ModelAndView();
		
		if(loginService.loginCheck(user)) {
			modelAndView.setViewName("index");
			modelAndView.addObject("user", user);
			session.setAttribute("user", user);
		}
		else {
			String message =" Login Failed!";
			modelAndView.addObject("message", message);
			modelAndView.setViewName("loginPage");
		}
		
		
		return modelAndView;
		
	}
}
