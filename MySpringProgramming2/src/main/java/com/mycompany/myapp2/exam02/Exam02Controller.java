package com.mycompany.myapp2.exam02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
	
	private static final Logger logger = LoggerFactory.getLogger(Exam02Controller.class);
	@RequestMapping("/index")
	public String index()
	{
		logger.info("exam02 index 요청 처리");
		return "/exam02/index";
	}
	
	@RequestMapping("/join")
	public String join(Member m)
	{
		logger.info("exam02 join 요청 처리");
		logger.info("mid: "+m.getMid());
		logger.info("mname: "+m.getMname());
		logger.info("mage: "+m.getMage());
		return "/exam02/index"; 
	}
	
	@RequestMapping("/order")
	public String order(String pid,String pname,String pprice,String pcompany)
	{
		logger.info("exam02 order 요청 처리");
		logger.info("pid: "+pid);
		logger.info("pname: "+ pname);
		logger.info("pprice: "+pprice);
		logger.info("pcompany: "+pcompany);
		return "/exam02/index";
	}
	
	@RequestMapping("/write")
	public String write(int bno,String title,String content,@RequestParam("count") int hitcount)
	{
		logger.info("exam02 write 요청처리");
		logger.info("bno: "+bno);
		logger.info("title: "+title);
		logger.info("content: "+content);
		logger.info("hitcount: "+hitcount);
		return "/exam02/index";
	}
	
	@RequestMapping("/update")
	public String update(Board b)
	{
		logger.info("exam02 update 요청처리");
		logger.info("bno: "+b.getBno());
		logger.info("title: "+b.getTitle());
		logger.info("content: "+b.getContent());
		logger.info("hitcount: "+b.getHitcount());
		return "/exam02/index";
	}
	
	@RequestMapping("/send")
	public String send(int bno,String title,String content,@RequestParam(defaultValue="0")int hitcount)
	{
		logger.info("exam02 send 요청처리");
		logger.info("bno: "+bno);
		logger.info("title: "+title);
		logger.info("content: "+content);
		logger.info("hitcount: "+hitcount);
		return "/exam02/index";
	}
	
}
