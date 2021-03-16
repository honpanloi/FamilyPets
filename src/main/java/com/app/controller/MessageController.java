package com.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "MessageController")
@RequestMapping(path = "/messages")
@CrossOrigin(origins = {"http://localhost:4200"})
public class MessageController {
	
}
