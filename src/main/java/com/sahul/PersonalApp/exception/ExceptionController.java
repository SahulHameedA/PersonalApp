package com.sahul.PersonalApp.exception;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ControllerAdvice
@EnableWebMvc
public class ExceptionController {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@ExceptionHandler(value = Exception.class)
	public String hanleException(HttpServletRequest req,Exception ex) {
		
		logger.error("Global Exception Handling : " + req.getRequestURL() + " threw an exception " + ex);
		
		return "error";
	}

}
