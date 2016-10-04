package com.mycompany.myapp2.exam06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/exam06")
public class Exam06Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam06Controller.class);
	
	@RequestMapping("/index")
	public String index()
	{
		logger.info("exam06 index 요청 처리");
		return "/exam06/index";
	}
	
	@RequestMapping("/method1")
	public String method1(HttpServletRequest request)
	{
		logger.info("exam06 method1 정보 요청");
		
		logger.info("WebClient IP: "+request.getRemoteAddr());
		logger.info("WebClient 종류: "+ request.getHeader("User-Agent"));
		if(request.getHeader("User-Agent").contains("Chrome"))
		{
			logger.info("브라우저 종류: 크롬");
		}
		else if(request.getHeader("User-Agent").contains("Trident/7.0"))
		{
			logger.info("브라우저 종류: 인터넷 익스플로어 11");
		}else if(request.getHeader("User-Agent").contains("MSIE"))
		{
			logger.info("브라우저 종류: 인터넷 익스플로어 10 이하");
		}
		
		//요청 파라미터 값 얻기
		logger.info("mid: "+ request.getParameter("mid"));
		logger.info("mname: "+ request.getParameter("mname"));
		//쿼리 문자열 얻기
		logger.info("쿼리 문자열: "+ request.getQueryString());
		//요청 URI
		logger.info("요청URI: "+request.getRequestURI());
		logger.info("요청URL: "+request.getRequestURL());
		logger.info("요청방식: "+request.getMethod());
		logger.info("시스템 파일 경로: "+request.getRealPath("/WEB-INF/image/photo1.jpg"));
		logger.info("시스템 파일 경로: "+request.getServletContext().getRealPath("/WEB-INF/image/photo1.jpg"));
		return "exam06/index";
	}
	
	@RequestMapping("/method2")
	public void method2(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		/*response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println("{mid:'fall',mname:'한가을'}");
		pw.flush();
		pw.close();*/
		
		response.setContentType("image/jpg");
		String fileName = "사진2.jpg";
		fileName = URLEncoder.encode(fileName,"UTF-8");
		
		response.setHeader("Content-Disposition", "attachment; filename=\""+fileName+"\"");
		OutputStream os = response.getOutputStream();
		String filePath = request.getServletContext().getRealPath("/WEB-INF/image/사진2.jpg");
		InputStream is = new FileInputStream(filePath);
		byte[] b = new byte[1024];
		int byteNum = -1;
		
		while((byteNum=is.read(b))!=-1)
		{
			os.write(b, 0, byteNum);
		}
		os.flush();
		is.close();
		os.close();
	
	}
	
	@RequestMapping("/method3")
	public String method3(@RequestHeader("User-Agent") String userAgent)
	{
		logger.info("exam06 method3 요청 처리");
		
		if(userAgent.contains("Chrome"))
		{
			logger.info("브라우저 종류: 크롬");
		}
		else if(userAgent.contains("Trident/7.0"))
		{
			logger.info("브라우저 종류: 인터넷 익스플로어 11");
		}else if(userAgent.contains("MSIE"))
		{
			logger.info("브라우저 종류: 인터넷 익스플로어 10 이하");
		}
		
		return "exam06/index";
	}
	
	@RequestMapping("/method4CreateCookie")
	public String method4CreateCookie(HttpServletResponse res) throws UnsupportedEncodingException
	{
		logger.info("exam06 cookie 생성 요청 처리");
		String name = "홍길동";
		name = URLEncoder.encode(name,"UTF-8");
		Cookie cookie1 = new Cookie("mid","fall");
		Cookie cookie2 = new Cookie("mname",name);
		
		cookie2.setMaxAge(60);
		
		
		res.addCookie(cookie1);
		res.addCookie(cookie2);
		
		return "exam06/index";
	}
	
	@RequestMapping("/method4ReceiveCookieHow1")
	public String method4ReceiveCookieHow1(HttpServletRequest req) throws UnsupportedEncodingException
	{
		logger.info("exam06 method4ReceiveCookie 요청 처리");
		
		//쿠키 받기 - 요청 헤더의 쿠키 정보를 읽기
		Cookie[] cookies = req.getCookies();
		if(cookies!=null)
		{
			for(Cookie cookie:cookies)
			{
				String name = cookie.getName();
				String value = null;
				if(name.equals("mname"))
				{
					value = URLDecoder.decode(cookie.getValue(),"UTF-8");
				}else
				{
					value = cookie.getValue();
				}
				System.out.println(cookie.getName()+":"+value);
			}
		}
		return "exam06/index";
	}
	
	@RequestMapping("/method4ReceiveCookieHow2")
	public String method4ReceiveCookieHow2(@CookieValue(defaultValue="")String mid,@CookieValue(defaultValue="")String mname)
	{
		logger.info("exam06 method4ReceiveCookieHow2 요청처리");
		System.out.println("mid: "+mid);
		System.out.println("mname: "+mname);
		return "exam06/index";
	}
	
	@RequestMapping("/method4DeleteCookie")
	public String method4DeleteCookie(HttpServletResponse response)
	{
		Cookie cookie1 = new Cookie("mid","");
		cookie1.setMaxAge(0);
		Cookie cookie2 = new Cookie("mname","");
		cookie2.setMaxAge(0); //메모리와 하드에 있는 쿠키가 전부 삭제
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		return "exam06/index";
	}
	
	
}
