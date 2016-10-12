package com.mycompany.myapp2.exam11.controller;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp2.exam11.dto.Member;
import com.mycompany.myapp2.exam11.service.Exam11MemberService;



@Controller("MemberController")
@RequestMapping("/exam11")
public class Exam11Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam11Controller.class);
	
	@Autowired
	private Exam11MemberService memberService;
	
	
	@RequestMapping("/index")
	public String index()
	{
		logger.info("index 처리");
		return "exam11/index";
	}
	
	@RequestMapping(value="/memberJoin",method=RequestMethod.GET)
	public String memberJoinForm()
	{
		logger.info("memberJoin(GET) 처리");
		return "exam11/memberJoinForm";
	}
	
	@RequestMapping(value="/memberJoin",method=RequestMethod.POST)
	public String memberJoin(Member member)
	{
		logger.info("memberJoin(POST) 처리");
		logger.info("memberJoin(POST) 처리");
		logger.info("mid: "+member.getMid());
		logger.info("mname: "+member.getMname());
		logger.info("mpassword: "+member.getMpassword());
		logger.info("memail: "+member.getMemail());
		logger.info("mtel: "+member.getMtel());
		logger.info("mjob: "+member.getMjob());
		logger.info("mskill: "+Arrays.toString(member.getMskill()));
		logger.info("maddress1: "+member.getMaddress1());
		logger.info("maddress2: "+member.getMaddress2());
		logger.info("mbirth: "+member.getMbirth());
		
		memberService.join(member);
		return "redirect:/exam11/memberLogin";
	}
	
	
}
