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

@RestController(value = "RequestController")
@RequestMapping(path = "/request")
@CrossOrigin(origins = {"http://localhost:4200"})
public class RequestController {
	
	private RequestService requestService;
	
	@Autowired
	public void setRequestService(RequestService requestService) {
		this.requestService = requestService;
	}
		
	
	
	
	@GetMapping(path="/pendingBuyer/{buyerid}")
	public List<Request> findAllByBuyerid(@PathVariable Integer buyerid){
		return this.requestService.findAllByBuyerid(buyerid);
	}	
	
	
	

	
	
	
	
	
}
