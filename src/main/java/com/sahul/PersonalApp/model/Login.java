package com.sahul.PersonalApp.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Login {
	
	@Email
	private String userName;
	
	@Size(min=3,message="Enter a valid password of 3 chars or more")
	@NotEmpty
	private String password;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
	
}
