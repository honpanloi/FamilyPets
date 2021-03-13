package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.PersonLogin;
import com.app.model.Request;
import com.app.repository.LoginRepository;
import com.app.repository.PersonRepository;
import com.app.repository.RequestRepository;

@Service (value = "loginService")
public class LoginService {
	
	
	private LoginRepository loginRepository;
	
	private RequestRepository requestRepository;
	
	private PersonRepository personRepository;
	
	@Autowired
	public void setLoginRepository(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}
	
	
	
	public PersonLogin findByLogin(String email, String password) {
		return this.loginRepository.findByLogin(email, password);
	}
	


}
