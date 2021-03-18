package com.app.controller;

import javax.servlet.http.HttpServletRequest;

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
import com.app.service.PersonService;

@RestController(value = "PersonController")
@RequestMapping(path = "/person")
@CrossOrigin(origins = {"http://localhost:4200"})
public class PersonController {

	private PersonService personService;	
		
	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}	
	
	@GetMapping(path="/view/{personid}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Person> findByPersonid(@PathVariable int personid){
		return new ResponseEntity<Person>(this.personService.findByPersonid(personid), HttpStatus.OK);
	}
	
	@PostMapping(path="/update")
	public void updateInformation(@RequestBody Person person) {
		System.out.println("updateInformation "+person);
		this.personService.updateInformation(person);
	}
	
}
