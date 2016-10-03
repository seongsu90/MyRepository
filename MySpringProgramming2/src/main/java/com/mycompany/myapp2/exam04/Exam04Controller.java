package com.mycompany.myapp2.exam04;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam04Controller.class);
	@RequestMapping("/index")
	public String index()
	{
		logger.info("exam04 index 요청 처리");
		return "/exam04/index";
	}
	
	@RequestMapping("/join")
	public String joinform()
	{
		logger.info("exam04 join 요청 처리");
		return "/exam04/join";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(Member m)
	{
		logger.info("exam04 join 요청 처리");
		logger.info("mid: "+m.getMid());
		logger.info("mname: "+m.getMname());
		logger.info("mpassword: "+m.getMpassword());
		logger.info("memail: "+m.getMemail());
		logger.info("mtel: "+m.getMtel());
		logger.info("mjob: "+m.getMjob());
		logger.info("mskill: "+Arrays.toString(m.getMskill()));
		logger.info("maddress1: "+m.getMaddress1());
		logger.info("maddress2: "+m.getMaddress2());
		logger.info("mbirth: "+m.getMbirth());
		return "/exam04/index";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(Board b)
	{
		logger.info("exam04 write 요청 처리");
		logger.info("category: "+b.getCategory());
		logger.info("bid: "+b.getBid());
		logger.info("password: "+b.getPassword());
		logger.info("title: "+ b.getTitle());
		logger.info("content: "+b.getContent());
		
		return "/exam04/index";
	}
	
	@RequestMapping(value="write", method = RequestMethod.GET)
	public String writeform()
	{
		logger.info("exam04 writeform 요청처리");
		return "/exam04/write";
	}
}
