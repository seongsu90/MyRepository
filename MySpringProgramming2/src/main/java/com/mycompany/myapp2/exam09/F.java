package com.mycompany.myapp2.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class F {
	private static final Logger logger = LoggerFactory.getLogger(F.class);
	
	private ServiceA sa;
	private ServiceB sb;
	private ServiceC sc;
	
	public F(ServiceA sa,ServiceB sb,ServiceC sc)
	{
		logger.info("F객체 성공");
		this.sa=sa;
		this.sb=sb;
		this.sc=sc;
	}
	
	public void method()
	{
		logger.info("exam09 F_method 실행");
		sa.method();
		sb.method();
		sc.method();
	}
}
