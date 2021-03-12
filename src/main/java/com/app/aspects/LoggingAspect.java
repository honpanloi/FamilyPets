package com.app.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component(value = "loggingAspect")
public class LoggingAspect {
	
	private static final Logger LOG = LogManager.getLogger(LoggingAspect.class);
	

}
