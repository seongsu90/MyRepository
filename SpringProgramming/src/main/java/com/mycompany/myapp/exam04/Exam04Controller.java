package com.mycompany.myapp.exam04;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class Exam04Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam04Controller.class);
	@RequestMapping("/exam04/index")
	public String index()
	{
		logger.info("index 요청 처리");
		return "exam04/index";
	}
	
	@RequestMapping(value="/exam04/join",method=RequestMethod.GET) // 같은 value값의 요청이지만 GET방식이면 joinform, POST방식이면 join이다.
	public String joinForm()										//GET방식으로 보낼땐 간단한 데이터, 사용자 입력 내용, GET은 문자만 보낼수 있다. 전송량에 제한이 있다.
	{																	// GET방식은 보내고자 하는 내용을 모두 시작행에 담아 보낸다. 본문행은 빈다.
		logger.info("joinForm 요청 처리");						//웹클라이언트를 통해 데이터를 넘긴다면 주소창에 나타난다. 보안취약
		return "exam04/joinform";
	}
	
	@RequestMapping(value="/exam04/join",method=RequestMethod.POST)
	public String join(Member member)												//POST는 데이터 크기의 제한이 없다. 파일전송도 된다.
	{																	//POST는 시작행에 요청 내용만 들어간다.(요청경로), 데이터값은 본문에 들어간다.
		logger.info("join 요청 처리");
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
		return "exam04/index";
	}
	
	@RequestMapping(value="/exam04/write",method=RequestMethod.GET)
	public String writeForm()
	{
		logger.info("writeForm 요청 처리");						//웹클라이언트를 통해 데이터를 넘긴다면 주소창에 나타난다. 보안취약
		return "exam04/writeform";
	}
	
	@RequestMapping(value="/exam04/write",method=RequestMethod.POST)
	public String write(String btitle,String bcontent)
	{
		logger.info("write 요청 처리");		
		logger.info("btitle: "+btitle);
		logger.info("bcontent: "+bcontent);
		
		return "exam04/writeform";
	}
	
}
