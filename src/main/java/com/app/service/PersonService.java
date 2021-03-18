package com.app.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Person;
import com.app.repository.PersonRepository;

@Service (value = "personService")
public class PersonService {

	private PersonRepository personRepository;
	
	@Autowired
	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public Person findByPersonid(int personid) {
		return this.personRepository.findByPersonid(personid);
	}
	
	public void updateInformation(Person person) {
			this.personRepository.save(person);
		}//don't change person information by another person
		
	
	
}
