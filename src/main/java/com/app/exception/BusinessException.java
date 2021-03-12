package com.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Sorry.")
public class BusinessException extends Exception{

	public BusinessException() {
		super();
	}

	public BusinessException(String message) {
		super(message);
	}

	
}
