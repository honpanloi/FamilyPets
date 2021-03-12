package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.Request;
import com.app.repository.RequestRepository;

@Service(value = "requestService")
public class RequestService {
	
	private RequestRepository requestRepository;
	
	public List<Request> findAllByBuyer_id(Integer buyer_id){
		return this.requestRepository.findAllByBuyer_id(buyer_id);
	}

}
