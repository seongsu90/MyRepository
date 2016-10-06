package com.mycompany.myapp2.exam08;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/exam08")
public class Exam08Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam08Controller.class);
	
	@RequestMapping("/index")
	public String index()
	{
		logger.info("exam08 index 요청 처리");
		return "exam08/index";
	}
	
	@RequestMapping("/join")
	public String join()
	{
		logger.info("exam08 join 처리");
		return "redirect:/exam08/index";
	}
	
	@RequestMapping("/write")
	public String write()
	{
		logger.info("exam08 write 처리");
		return "redirect:/exam08/list";
	}
	@RequestMapping("/list")
	public String list()
	{
		logger.info("exam08 list 처리");
		return "exam08/list";
	}
}
