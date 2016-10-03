package com.mycompany.myapp2.exam03;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	private static final Logger logger = LoggerFactory.getLogger(Exam03Controller.class);
	@RequestMapping("/index")
	public String index()
	{
		logger.info("exam03 index 요청 처리");
		return "/exam03/index";
	}
	
	@RequestMapping("/join")
	public String join(Member m)
	{
		logger.info("exam03 join 요청처리");
		logger.info("mid: "+m.getMid());
		logger.info("mname: "+m.getMname());
		logger.info("mpassword: "+m.mpassword);
		logger.info("memail: "+m.getMemail());
		logger.info("mtel: "+m.getMtel());
		logger.info("mjob: "+m.getMjob());
		logger.info("mskill: "+Arrays.toString(m.getMskill()));
		logger.info("maddress1: "+m.getMaddress1());
		logger.info("maddress2: "+m.getMaddress2());
		logger.info("mbirth: "+m.getMbirth());
		return "/exam03/index";
	}
}
