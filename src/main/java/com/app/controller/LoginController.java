package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Person;
import com.app.model.PersonLogin;
import com.app.model.Request;
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
	public void setRequestService(RequestService requestService) {
		this.requestService = requestService;
	}
		
	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	
	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	
	
	@GetMapping(path="/pendingBuyer/{buyerid}")
	public List<Request> findAllByBuyerid(@PathVariable Integer buyerid){
		return this.requestService.findAllByBuyerid(buyerid);
	}	
	
	
	
//	@PostMapping(path="/login", produces= {MediaType.APPLICATION_JSON_VALUE})
//	public PersonLogin findByLogin(String email, String password) {
//		return this.loginService.findByLogin(email, password);
//	}
	
	@PostMapping(path="/login")//, consumes= {MediaType.APPLICATION_JSON_VALUE})
	public PersonLogin findByEmailAndPassword(@RequestParam String email,@RequestParam String password) {
		return this.loginService.findByEmailAndPassword(email, password);
	}
	
	
	
	@GetMapping(path="/person/{personid}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Person> findByPersonid(@PathVariable int personid){
		return new ResponseEntity<Person>(this.personService.findByPersonid(personid), HttpStatus.OK);
	}
	
	
}
