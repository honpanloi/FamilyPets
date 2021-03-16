package com.app.service;

import java.sql.Date;
import java.time.LocalDate;
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
	
	public List<Request> findAllByBuyerid(Integer buyerid){
		return this.requestRepository.findAllByBuyerid(buyerid);
	}
	
	public void acceptRequest(Request request) {
		request.setDateaccepted(Date.valueOf(LocalDate.now()));
		this.requestRepository.save(request);
	}

}
