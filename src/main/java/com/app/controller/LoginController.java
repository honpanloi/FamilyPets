package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.PersonLogin;
import com.app.service.LoginService;
import com.app.service.PersonService;
import com.app.service.RequestService;

@RestController(value = "LoginController")
@RequestMapping(path = "/login")
@CrossOrigin(origins = {"http://localhost:4200"})
public class LoginController {
	
	private RequestService requestService;
	private LoginService loginService;
	private PersonService personService;
	
	
		
	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	
	
	

	
	@PostMapping(path="/login")//, consumes= {MediaType.APPLICATION_JSON_VALUE})
	public PersonLogin findByEmailAndPassword(@RequestParam String email,@RequestParam String password, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("Email", email);
		return this.loginService.findByEmailAndPassword(email, password);
	}
	
	
	

	
}
