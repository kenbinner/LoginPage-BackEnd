package com.kengo.controller;

import com.kengo.modal.User;

public class LoginPageControllerImpl implements LoginPageController{

	@Override
	public String authenticateUser(String email, String password){
		
		// Add code to connect and retrieve user data from database based on email...
		
		User userFromDatabase = new User(1, "Kengo Binner", "kengo.binner@infosys.com", "123Infy");
		
		// If input password matches, set to response code 01. else set to 02.
		
		if(userFromDatabase.getPassword().equals(password)) {
			return "01";
		}else {
			return "02";
		}
	}

}
