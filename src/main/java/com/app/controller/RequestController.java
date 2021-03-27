package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Request;
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
	
	//----------------------------------------------------------------------------------------------	
	
	//endpoint for buyer
	@GetMapping(path="/view/{buyerid}/{requeststatus}")
	public List<Request> findAllByBuyerid(@PathVariable Integer buyerid,@PathVariable String requeststatus){
		
		System.out.println("IN HERE: "+requeststatus);
		return this.requestService.findAllByBuyerid(buyerid, requeststatus);
	}	
	
	//endpoint for breeder
	@GetMapping(path="/pending")
	public List<Request> findAllByRequestStatus (){
		return this.requestService.findAllByRequestStatus();
	}
	
	//endpoint for breeder
	@GetMapping(path="/resolved/{breederid}")
	public List<Request> findAllAcceptedByBreederid (@PathVariable int breederid){
		return this.requestService.findAllAcceptedByBreederid(breederid);
	}
	
	//endpoint for breeder
	@PostMapping(path="/update")//need to test with session
	public void acceptRequest (@RequestBody Request request) {
		System.out.println("update "+request);
		this.requestService.acceptRequest(request);
	}

	//endpoint for buyer
	@PostMapping(path="/create")
	public void createRequest (@RequestBody Request request) {
		request.setBreederid(null);
		request.setDateaccepted(null);
		System.out.println("create new "+request);
		this.requestService.createRequest(request);
	}
	
	//endpoint for buyer
	@PostMapping(path="/update/animaltype")
	public void updateRequest (@RequestBody Request request) {
		System.out.println("update "+request);
		this.requestService.updateRequest(request);
	}
	
	
	
}