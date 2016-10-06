package com.mycompany.myapp2.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
@RequestMapping("/exam09")
public class Exam09Controller {
	
	private static final Logger logger = LoggerFactory.getLogger(Exam09Controller.class);
	
	public Exam09Controller()
	{
		logger.info("Exam09Controller 객체 생성");
	}
	
	@RequestMapping("/index")
	public String index()
	{
		logger.info("exam09 index 처리");
		return "exam09/index";
	}
	
	
	private A a;
	public void setA(A a)
	{
		logger.info("setA() 실행");
		this.a = a;
	}
	
	private B b;
	public void setB(B b)
	{
		logger.info("setB() 실행");
		this.b=b;
	}
	
private ServiceA serviceA;
	
	public void setServiceA(ServiceA sa)
	{
		logger.info("setServiceA() 실행");
		this.serviceA=sa;
	}
	
	private ServiceB serviceB;
	
	public void setServiceB(ServiceB sb)
	{
		logger.info("setServiceB() 실행");
		this.serviceB =sb;
	}
	
	private ServiceC serviceC;
	
	public void setServiceC(ServiceC serviceC) {
		this.serviceC = serviceC;
	}
	
	public ServiceD serviceD;
	public void setServiceD(ServiceD sd)
	{
		this.serviceD=sd;
	}
	
	@RequestMapping("/method1")
	public String method1()
	{
		logger.info("exam09 method1 처리");
		a.method();
		b.method();
		serviceA.method();
		serviceB.method();
		serviceC.method();
		serviceD.method();
		return "redirect:/exam09/index";
	}
}