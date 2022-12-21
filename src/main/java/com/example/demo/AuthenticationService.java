package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean Authenticate(String username,String password) {
		boolean isValidUserName= username.equalsIgnoreCase("sample");
		boolean isValidPassword=password.equalsIgnoreCase("good");
		
		return (isValidUserName && isValidPassword); 
	}
}
