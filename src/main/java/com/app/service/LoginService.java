package com.app.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Person;
import com.app.model.PersonLogin;
import com.app.repository.LoginRepository;

@Service (value = "loginService")
public class LoginService {
	
	
	private LoginRepository loginRepository;
	
	
	@Autowired
	public void setLoginRepository(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}	

	public Person findByEmailAndPassword(String email, String password, HttpServletRequest request) {
		Person person = null;
		PersonLogin personLogin = this.loginRepository.findByEmailAndPassword(email, password);
		
		
		if (personLogin != null) {
			person = personLogin.getPerson();
		}
		if (person != null) {
			HttpSession session = request.getSession();
			
			if(session==null) {
				System.out.println("session is null");
			}
			session.setAttribute("person", person);

//			System.out.println(session.getAttribute("person").toString());
			return person;
		}else {
			return null;
		}
	}
}
