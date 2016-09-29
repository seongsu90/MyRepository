package com.mycompany.myapp.exam02;

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
		logger.info("index 요청 처리");
		return "exam02/index";
	}
	
	/*@RequestMapping("/join")*/
	/*public String join(String mid,String mname,String mage)
	{
		logger.info("join 요청 처리");
		logger.info("mid: "+mid);
		logger.info("mname: "+mname);
		logger.info("mage: "+mage);
		
		return "exam02/index";
	}*/
	
	@RequestMapping("/join")
	public String join(Member member)
	{
		logger.info("join 요청 처리");
		logger.info("mid: " + member.getMid());
		logger.info("mname: "+member.getMname());
		logger.info("mage: "+member.getMage());
		
		return "exam02/index";
	}
	
	@RequestMapping("/login") // 이것도 사실 @RequestParam("value="/login")이 생략된거.
	public String login(
			@RequestParam("id") String mid, // @RequestParam("id") 는 사실 @RequestParam(value="id")의 value= 이 생략된거다.
			@RequestParam ("password") String mpassword)
	{
		logger.info("login 요청 처리");
		logger.info("mid: "+mid);
		logger.info("mpassword: "+mpassword);
		
		return "exam02/index";
	}
	
	@RequestMapping("/order")
	public String order( String pid, String pname, int pprice, String pcompany) //String으로 넘어오지만 int로 선언해도 Spring에서 String으로 자동 변환한다.
	{
		logger.info("order 요청 처리");
		logger.info("pid: "+pid);
		logger.info("pname: "+pname);
		logger.info("pprice: "+pprice);
		logger.info("pcompany: "+pcompany);
		
		return "exam02/index";
	}
	
	@RequestMapping("/write")  //@RequestParam(defaultValue="?") 은 int의 값이 넘어오지않을때 초기값을 지정해준다. 범위는 , 까지다.
	public String write(
			@RequestParam(defaultValue="1") int bno,
			String title,String content,
			@RequestParam(defaultValue="0") int hitcount)
	{
		
		logger.info("writer 요청 처리");
		logger.info("bno: "+bno);
		logger.info("title: "+title);
		logger.info("content: "+content);
		logger.info("hitcount: "+hitcount);
		return "exam02/index";
	}
	
	@RequestMapping("/update")  //@RequestParam 은 int의 값이 넘어오지않을때 초기값을 지정해준다. 범위는 , 까지다.
	public String update(
			@RequestParam(defaultValue="1") int bno,
			String title,String content,
			@RequestParam(value="count",defaultValue="0") int hitcount) //@RequestParam에 두가지 값을 넣을려면 약식형(value 안쓰는거) 대신 풀 내임을 써야된다.
	{		// @RequestParam("count",defaultValue="0") int hitcount 는 문법 오류다.
		
		logger.info("update 요청 처리");
		logger.info("bno: "+bno);
		logger.info("title: "+title);
		logger.info("content: "+content);
		logger.info("hitcount: "+hitcount);
		return "exam02/index";
	}
	
	@RequestMapping("/send")  
	public String send(Board board) // 매개 변수가 너무 많으면 클래스로 받아 처리한다.
	{
		
		logger.info("send 요청 처리");
		logger.info("bno: "+board.getBno());
		logger.info("title: "+board.getTitle());
		logger.info("content: "+board.getContent());
		logger.info("hitcount: "+board.getHitcount());
		return "exam02/index";
	}
	
}
