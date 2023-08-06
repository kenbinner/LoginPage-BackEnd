package com.kengo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import com.kengo.controller.LoginPageController;
import com.kengo.modal.User;

public class LoginPageServiceImpl implements LoginPageService{
	
	@Autowired LoginPageController loginPageController;

	@PostMapping(value = "customerLogin")
	public ResponseEntity<String> authenticateUser(@RequestBody User user) throws Exception {
		try {
			String responseCode = loginPageController.authenticateUser(user.getEmail(), user.getPassword());
			
			return new ResponseEntity<String>(responseCode, HttpStatus.OK);
			
		}catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, e.getMessage());
		}
	}

}
