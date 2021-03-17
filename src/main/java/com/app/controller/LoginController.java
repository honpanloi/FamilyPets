package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Person;
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
	public Person findByEmailAndPassword(@RequestParam String email,@RequestParam String password, HttpServletRequest request) {

		return this.loginService.findByEmailAndPassword(email, password, request);
	}
	
	@PostMapping(path="logout")
	public void logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session != null) {
			session.invalidate();
		}
	}

	
}
