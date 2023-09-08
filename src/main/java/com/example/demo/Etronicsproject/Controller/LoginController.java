package com.example.demo.Etronicsproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import com.example.demo.Etronicsproject.Entity.Loginform;
import com.example.demo.Etronicsproject.Service.LoginService;


public class LoginController {


	@Autowired
	LoginService loginService;
	
	@GetMapping("/login")
	public Loginform login(@RequestHeader String email ,
			@RequestHeader String password) {
		
		return loginService.login(email, password); 
}
}
