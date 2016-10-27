package com.mycompany.myapp2.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class C {
	private static final Logger logger = LoggerFactory.getLogger(C.class);
	
	private D d;
	
	public C(D d)
	{
		logger.info("C객체 생성");
		this.d=d;
	}
	
	public void method()
	{
		logger.info("exam09 C_method실행");
		d.method();
	}
}