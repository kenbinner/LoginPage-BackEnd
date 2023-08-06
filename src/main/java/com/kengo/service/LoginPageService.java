package com.kengo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.kengo.modal.User;

public interface LoginPageService {
	
	public ResponseEntity<String> authenticateUser(@RequestBody User user) throws Exception;

}
