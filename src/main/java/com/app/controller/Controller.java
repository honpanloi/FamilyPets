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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Person;
import com.app.model.PersonLogin;
import com.app.model.Request;
import com.app.service.LoginService;
import com.app.service.PersonService;
import com.app.service.RequestService;

@RestController(value = "Controller")
@RequestMapping(path = "/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class Controller {
	
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
	
	
	
	@GetMapping(path="/pendingBuyer/{buyer_id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Request>> findAllByBuyer_id(@PathVariable int buyer_id){
		return new ResponseEntity<List<Request>>(this.requestService.findAllByBuyer_id(buyer_id), HttpStatus.OK);
	}	
	
	
	
	@PostMapping(path="/login", produces= {MediaType.APPLICATION_JSON_VALUE})
	public PersonLogin findByLogin(String email, String password) {
		return this.loginService.findByLogin(email, password);
	}
	
	
//	@GetMapping(path="/person/{person_id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
//	public ResponseEntity<Person> findByPerson_id(@PathVariable int person_id){
//		return new ResponseEntity<Person>(this.personService.findByPerson_id(person_id), HttpStatus.OK);
//	}
	
	
}
