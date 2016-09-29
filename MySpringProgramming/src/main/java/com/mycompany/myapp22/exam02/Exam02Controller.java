package com.mycompany.myapp22.exam02;

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
		logger.info("index 정보 요청");
		return "/exam02/index";
	}
	
	@RequestMapping("/join")
	public String join(Member m)
	{
		logger.info("join 정보 요청");
		logger.info("mid: "+m.getMid());
		logger.info("mname: "+m.getMname());
		logger.info("mage: "+m.getMage());
		return "/exam02/index";
	}
	
	@RequestMapping("/order")
	public String order(int pid,String pname,int pprice,String pcompany)
	{
		logger.info("order 정보 요청");
		logger.info("pid: "+ pid);
		logger.info("pname: "+pname );
		logger.info("pprice: "+pprice);
		logger.info("pcompany: "+pcompany);
		return "/exam02/index";
	}
	
	@RequestMapping("/write")
	public String write(
			@RequestParam(defaultValue="0") int bno,
			String title,String content,
			@RequestParam(defaultValue="0") int hitcount)
	{
		logger.info("write 정보 요청");
		logger.info("bno: "+ bno);
		logger.info("title: "+title );
		logger.info("content: "+content);
		logger.info("hitcount: "+hitcount);
		return "/exam02/index";
	}
	
	@RequestMapping("/update")
	public String update(
			@RequestParam(defaultValue="0") int bno,
			String title,String content,
			@RequestParam(value="count",defaultValue="0") int hitcount)
	{
		logger.info("update 정보 요청");
		logger.info("bno: "+ bno);
		logger.info("title: "+title );
		logger.info("content: "+content);
		logger.info("hitcount: "+hitcount);
		return "/exam02/index";
	}
	
	@RequestMapping("/send")
	public String send(Board b)
	{
		logger.info("send 정보 요청");
		logger.info("bno: "+ b.getBno());
		logger.info("title: "+b.getTitle());
		logger.info("content: "+b.getContent());
		logger.info("hitcount: "+b.getHitcount());
		return "/exam02/index";
	}
	
}
