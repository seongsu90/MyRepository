package com.mycompany.myapp2.exam10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class G {
	
	private static final Logger logger = LoggerFactory.getLogger(G.class);
	
	public void method()
	{
		logger.info("G_method 실행");
	}
}
