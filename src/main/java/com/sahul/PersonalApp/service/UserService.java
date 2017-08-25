package com.sahul.PersonalApp.service;
import org.springframework.stereotype.Service;

import com.sahul.PersonalApp.model.Login;

@Service
public class UserService {

	public boolean validateLogin(Login login) {
		
		//simulating Exception to validate Global Exception controller
		throw new RuntimeException("Database is down, unable to validate login credentials");
		
		//if (login.getUserName().equals("sahul.hameed.a@gmail.com") &&
		//		login.getPassword().equals("pwd"))
		//	return true;
		
		//return false;
		
	}
}
