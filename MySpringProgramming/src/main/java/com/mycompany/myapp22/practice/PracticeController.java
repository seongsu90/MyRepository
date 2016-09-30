package com.mycompany.myapp22.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/practice")
public class PracticeController {
	
	private static final Logger logger = LoggerFactory.getLogger(PracticeController.class);
	@RequestMapping("/index")
	public String index()
	{
		logger.info("index 요청 처리");
		return "practice/index";
	}
	
	@RequestMapping(value="/write",method=RequestMethod.GET)
	public String write()
	{
		logger.info("write 요청 처리");
		return "practice/writeForm";
	}
	
	@RequestMapping(value="/write",method=RequestMethod.POST)
	public String confirm(Board b)
	{
		logger.info("카테고리: "+b.getCategory());
		logger.info("아이디: "+b.getBid());
		logger.info("비밀번호: "+b.getContent());
		logger.info("제목: "+b.getTitle());
		logger.info("내용: "+b.getPassword());
		return "practice/index";
	}
}
