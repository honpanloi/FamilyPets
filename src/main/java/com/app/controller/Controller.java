package com.app.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Request;
import com.app.service.RequestService;

@RestController(value = "Controller")
@RequestMapping(path = "")
@CrossOrigin(origins = {"http://localhost:4200"})
public class Controller {
	
	private RequestService requestService;
	
	@GetMapping(path="/request/pendingBuyer", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Request> findAllByBuyer_id(Integer buyer_id){
		return this.requestService.findAllByBuyer_id(buyer_id);}
	
	
	
	
}
