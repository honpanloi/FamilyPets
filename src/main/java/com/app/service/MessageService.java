package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Message;
import com.app.repository.MessageRepository;

@Service(value="messageservice")
public class MessageService {
	
	private MessageRepository messagerepository;
	
	@Autowired
	public void GetMessageRepository(MessageRepository messagerepository) {
		this.messagerepository = messagerepository;
	}
	//----------------------------------------------------------------------------------
	
	
	public void createMessage(Message message) {
		this.messagerepository.save(message);
	}
	
	public List<Message> viewMessages(int requestid){
		return this.messagerepository.findAllByRequestid(requestid);
	}

}
