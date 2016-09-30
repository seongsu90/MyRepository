package com.mycompany.myapp.exam05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/exam05")
public class Exam05Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam05Controller.class);
	@RequestMapping("/index")
	public String index()
	{
		logger.info("index 요청 처리");
		return "exam05/index";
	}
	

	@RequestMapping("/index2")
	public ModelAndView index2()
	{
		logger.info("index2 요청 처리");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("exam05/index");
		return mav;
	}
	
	@RequestMapping("/index3") // 메소드에 경로에 대한 리턴이 없으면 매핑의 마지막 주소에 .jsp를 붙인다.
	public void index3(HttpServletRequest request,HttpServletResponse response) throws IOException //응답을 보내는 객체는 Response 객체
	{
		logger.info("index3 요청 처리");
		
		response.setContentType("image/jpeg");
		
		String filePath = request.getServletContext().getRealPath("/WEB-INF/image/photo1.jpg"); // 실제 경로 구하는법 request를 선언한다.
		//헤더를 더 추가 시킬려면 response.setHeader(name, value); 를 쓴다. ex)
		//OutputStream os =response.getOutputStream();
		InputStream is = new FileInputStream(filePath);
		OutputStream os = response.getOutputStream();
		
		byte[] values = new byte[1024];
		int byteNum = -1;
		while((byteNum = is.read(values))!=-1)
		{
			os.write(values, 0, byteNum);
		}
		os.flush();
		is.close();
	}
	
	
}
