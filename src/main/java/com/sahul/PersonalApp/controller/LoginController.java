package com.sahul.PersonalApp.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sahul.PersonalApp.service.UserService;
import com.sahul.PersonalApp.model.Login;

@Controller
public class LoginController {

	protected final Log logger = LogFactory.getLog(getClass()); 

	@Autowired
	UserService service;
	
	/**
	 * Show Login Page as the initial Landing Page
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {	
		return "login";		
	}
	
	/**
	 * Validate login credentials
	 * @param userName
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView performLogin(@RequestParam() String userName,
								@RequestParam() String password) {
		
		logger.info("You have entered the user name as " + userName);
		
		Login login = new Login();
		login.setUserName(userName);
		login.setPassword(password);
		
		boolean chk = service.validateLogin(login);
		logger.info("Login validation status " + chk);
		
		ModelAndView mav;
		if (chk) {
			mav = new ModelAndView("redirect:home");
		} 
		else {
			mav = new ModelAndView("login");
			mav.addObject("errorMessage", "Invalid Credentials");
		}
				
		return mav;
		
	}
	
}
