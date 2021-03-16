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

import com.app.model.Message;
import com.app.service.MessageService;

@RestController(value = "MessageController")
@RequestMapping(path = "/messages")
@CrossOrigin(origins = {"http://localhost:4200"})
public class MessageController {
	
	private MessageService messageservice;
	
	@Autowired
	public void getMessageService(MessageService messageservice) {
		this.messageservice = messageservice;
	}
	
	
	@PostMapping(path = "/create/{requestid}/{personid}/{content}")
	public void createMessage(@PathVariable int requestid, @PathVariable int personid, @PathVariable String content) {
		this.messageservice.createMessage(requestid, personid, content);
	}
	
	@GetMapping(path = "/view/{requestid}")
	public List<Message> viewMessages(@PathVariable int requestid){
		return this.messageservice.viewMessages(requestid);
	}
	
}
