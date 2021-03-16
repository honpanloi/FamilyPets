package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Message;
import com.app.model.Person;
import com.app.model.Request;
import com.app.repository.MessageRepository;
import com.app.repository.PersonRepository;
import com.app.repository.RequestRepository;

@Service(value="messageservice")
public class MessageService {
	
	private MessageRepository messagerepository;
	
	@Autowired
	private RequestRepository requestrepository;
	
	@Autowired
	private PersonRepository personrepository;
	
	@Autowired
	public void GetMessageRepository(MessageRepository messagerepository) {
		this.messagerepository = messagerepository;
	}
	//----------------------------------------------------------------------------------
	
	
	public void createMessage(int senderid, int requestid, String content) {
		Person person = this.personrepository.findById(senderid).get();
		Request request = this.requestrepository.findById(requestid).get();
		Message message = new Message();
		message.setsenderid(person);
		message.setrequestid(request);
		message.setContent(content);
		this.messagerepository.save(message);
	}
	
	public List<Message> viewMessages(int requestid){
		return this.messagerepository.findAllByRequestid(requestid);
	}

}
