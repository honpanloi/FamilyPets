package com.app.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Person;
import com.app.model.Request;
import com.app.repository.RequestRepository;

@Service(value = "requestService")
public class RequestService {
	
	private RequestRepository requestRepository;
	
	@Autowired
	public void setRequestRepository(RequestRepository requestRepository) {
		this.requestRepository = requestRepository;
	}
	
	
	
	
	
	public List<Request> findAllByBuyerid(Integer buyerid, String requeststatus){
		return this.requestRepository.findAllByBuyeridAndRequeststatus(buyerid, requeststatus);
	}
	
	public void acceptRequest(Request request, HttpServletRequest httpRequest) {
		HttpSession session = httpRequest.getSession(false);
		Person person = (Person) session.getAttribute("person");
		if(person.isIsbreeder()) {
			request.setDateaccepted(Date.valueOf(LocalDate.now()));	
		}
		
		this.requestRepository.save(request);
	}
	
	public void createRequest(Request request) {
		this.requestRepository.save(request);
	}

}
