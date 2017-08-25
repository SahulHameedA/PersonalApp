package com.sahul.PersonalApp.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String showLoginPage(ModelMap model) {		
		model.addAttribute("login",new Login());
		return "login";		
	}
	
	/**
	 * Validate login credentials
	 * @param userName
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView performLogin(@ModelAttribute("login") @Valid Login login,BindingResult result) {
		
		ModelAndView mav;
		
		if (result.hasErrors()) {
			logger.error("Login-Form validation has failed, User needs to enter correct details");
			mav = new ModelAndView("login");
			mav.addObject("login", login);
			return mav;
		}
		
		logger.info("You have entered the user name as " + login.getUserName());
				
		boolean chk = service.validateLogin(login);
		
		logger.info("Login validation status " + chk);
				
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
