package com.sahul.PersonalApp.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SiteController {

	protected final Log logger = LogFactory.getLog(getClass()); 
	
	/**
	 * Show Home Page as the initial Landing Page
	 * @return
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showLoginPage() {		
		logger.info("Loading the Home page for the user ...");
		return "home";		
	}	
	
	
	/**
	 * Show Career Page 
	 * @return
	 */
	@RequestMapping(value = "/career", method = RequestMethod.GET)
	public String showCareerPage() {		
		logger.info("Loading the Career page for the user ...");
		return "career";		
	}
	
	/**
	 * Show Documents Page 
	 * @return
	 */
	@RequestMapping(value = "/documents", method = RequestMethod.GET)
	public String showDocumentsPage() {		
		logger.info("Loading the Documents page for the user ...");
		return "documents";		
	}
	
	/**
	 * Show Education Page 
	 * @return
	 */
	@RequestMapping(value = "/education", method = RequestMethod.GET)
	public String showEducationPage() {		
		logger.info("Loading the Education page for the user ...");
		return "education";		
	}
	
	/**
	 * Show Finance Page 
	 * @return
	 */
	@RequestMapping(value = "/finance", method = RequestMethod.GET)
	public String showFinancePage() {		
		logger.info("Loading the Finance page for the user ...");
		return "finance";		
	}
	
	/**
	 * Show Islam Page 
	 * @return
	 */
	@RequestMapping(value = "/islam", method = RequestMethod.GET)
	public String showIslamPage() {		
		logger.info("Loading the Islam page for the user ...");
		return "islam";		
	}
	
	/**
	 * Show Settings Page 
	 * @return
	 */
	@RequestMapping(value = "/settings", method = RequestMethod.GET)
	public String showSettingsPage() {		
		logger.info("Loading the Settings page for the user ...");
		return "settings";		
	}
				
}
