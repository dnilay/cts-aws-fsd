package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@SessionAttributes("name")
public class LoginController {
	

	private LoginService service;
	private static Logger logger=LoggerFactory.getLogger(LoginController.class);
	public LoginController(LoginService service) {
		super();
		
		this.service = service;
		logger.info("within service");
	}

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){
		logger.info("within login..");
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
		
		logger.info("login successed.");
		boolean isValidUser = service.validateUser(name, password);
		
		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
		model.put("name", name);
		model.put("password", password);
		
		return "welcome";
	}

}