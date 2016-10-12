package com.mycompany.myapp2.exam10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class H {
	
	private static final Logger logger = LoggerFactory.getLogger(H.class);
	
	public void method()
	{
		logger.info("H_method 실행");
	}
}
