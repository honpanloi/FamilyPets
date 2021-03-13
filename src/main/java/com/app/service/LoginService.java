package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.PersonLogin;
import com.app.repository.LoginRepository;

@Service (value = "loginService")
public class LoginService {
	
	
	private LoginRepository loginRepository;
	
	@Autowired
	public void setLoginRepository(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}
	
	public PersonLogin findByLogin(String email, String password) {
		return this.loginRepository.findByLogin(email, password);
	}

}
