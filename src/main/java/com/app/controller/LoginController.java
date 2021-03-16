package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.LoginService;

@RestController(value = "LoginController")
@RequestMapping(path = "/")
@CrossOrigin(origins = {"http://localhost:4200"})
public class LoginController {
	
	private LoginService loginService;
	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	
	@PostMapping(path="login")//, consumes= {MediaType.APPLICATION_JSON_VALUE})
	public int findByEmailAndPassword(@RequestParam String email,@RequestParam String password, HttpServletRequest request) {

		return this.loginService.findByEmailAndPassword(email, password, request);
	}
	
	
	

	
}
