package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Request;
import com.app.repository.RequestRepository;

@Service(value = "requestService")
public class RequestService {
	
	private RequestRepository requestRepository;
	
	@Autowired
	public void setRequestRepository(RequestRepository requestRepository) {
		this.requestRepository = requestRepository;
	}
	//------------------------------------------------------------------------------------------
	
	//Buyer: find by buyer id and pending or accepted status
	public List<Request> findAllByBuyerid(Integer buyerid, String requeststatus){
		return this.requestRepository.findAllByBuyeridAndRequeststatus(buyerid, requeststatus);
	}
	
	//Breeder: find all pending
	public List<Request> findAllByRequestStatus (){
		return this.requestRepository.findAllByRequestStatus();
	}
	
	//Breeder: find all accepted by breeder id
	public List<Request> findAllAcceptedByBreederid(int breederid){
		return this.requestRepository.findAllByBreederidAndRequeststatus(breederid);
	}
	
	//Breeder: accept request
	public void acceptRequest(Request request) {
//		Person person = (Person) request.set
//		if(person.isIsbreeder()) {
//			request.setDateaccepted(Date.valueOf(LocalDate.now()));	
//		}
		
		this.requestRepository.save(request);
	}
	
	public void createRequest(Request request) {
		this.requestRepository.save(request);
	}
	
	public void updateRequest(Request request) {
		Request newRequest = this.requestRepository.findByRequestid(request.getRequestid());
		request.setDateissued(newRequest.getDateissued());
		request.setDateaccepted(null);
		request.setBreederid(null);
		this.requestRepository.save(request);
	}

}
