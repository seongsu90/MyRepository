package com.mycompany.myapp.exam06;

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
import javax.servlet.http.HttpSession;

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
		logger.info("index 정보 요청");
		return "exam06/index";
	}
	
	@RequestMapping("/method1")
	public String method1(HttpServletRequest request)
	{					//request는 요청 HTTP에 대한 모든 내용을 가지고 있다.
						// 시작행, 헤더행, 본문행들의 정보를 알 수 있다.
		logger.info("method1 정보 요청");
		//클라이언트의 IP얻기
		logger.info("WebClient IP: "+request.getRemoteAddr());
		//클라이언트의 브라우저 종류 얻기
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
		logger.info("요청URI: "+request.getRequestURI()); //호출을 제외한 주소
		logger.info("요청URL: "+request.getRequestURL()); // 전체 주소
		logger.info("요청방식: "+request.getMethod());
		logger.info("시스템 파일 경로: "+request.getRealPath("/WEB-INF/image/photo1.jpg"));
		logger.info("시스템 파일 경로: "+request.getServletContext().getRealPath("/WEB-INF/image/photo1.jpg"));
		return "exam06/index";
	}
	
	@RequestMapping("/method2")
	public void method2(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		logger.info("method2 요청 처리");
		
		/*response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println("{mid:'fall',mname:'한가을'}");
		pw.flush();
		pw.close();
		문자보낼때 쓰는거*/
		
		//그림보낼때
		response.setContentType("image/jpeg");
		String fileName = "사진2.jpg";
		fileName = URLEncoder.encode(fileName,"UTF-8"); // 파일이름을 한글로 다운받을때 인코딩을 해야된다.
		/*response.setHeader("Content-Disposition", "attachment; filename=\"사진1.jpg\"");*/ //다운로드 설정\"222\" 로하면 이름 사이에 공백이있어도 인식한다.
		response.setHeader("Content-Disposition", "attachment; filename=\""+fileName+"\"");
		OutputStream os = response.getOutputStream();
		
		String filePath = request.getServletContext().getRealPath("/WEB-INF/image/사진2.jpg");
		InputStream is = new FileInputStream(filePath);
		byte[] values = new byte[1024];
		
		
		int byteNum = -1;
		while((byteNum=is.read(values))!=-1)
		{
			os.write(values,0,byteNum);
		}
		os.flush();
		is.close();
		os.close();
	}
	
	@RequestMapping("/method3")
	public String method3(@RequestHeader("User-Agent") String userAgent)
	{
		logger.info("method03 요청 처리");
		
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
	public String method4CreateCookie(HttpServletResponse response) throws UnsupportedEncodingException
	{
		logger.info("method4CreateCookie 요청 처리");
		String name = "홍길동"; //한글은 깨지기 때문에 인코딩, 디코딩을 해야된다.
		name=URLEncoder.encode(name,"UTF-8");
		
		//쿠키 생성
		Cookie cookie1 = new Cookie("mid","fall");
		Cookie cookie2 = new Cookie("mname",name);
		cookie2.setMaxAge(60);
		
		//쿠키 보내기(저장) - 응답 헤더에 쿠키 정보를 저장
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		
		return "exam06/index";
	}
	
	@RequestMapping("/method4ReceiveCookieHow1")
	public String method4ReceiveCookieHow1(HttpServletRequest request) throws UnsupportedEncodingException
	{
		logger.info("method4ReceiveCookie 요청 처리");
		//방법1(원래 형식)
		//쿠키 받기 - 요청 헤데의 쿠키 정보를 읽기
		Cookie[] cookies=request.getCookies();
		if(cookies!=null)
		{
			for(Cookie cookie: cookies)
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
	public String method4ReceiveCookieHow2(@CookieValue(defaultValue="") String mid,@CookieValue(defaultValue="") String mname) //쿠키이름이랑 변수이름이랑 같아야한다. 다른 경우는 @CookieValue("mid") String id로 준다.
	{
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
	
	@RequestMapping("/method5SetObject")
	public String method5SetObject(HttpSession session)
	{
		//객체 생성
		Member member = new Member("fall","한가을");
		
		//HttpSession에 객체 저장
		session.setAttribute("member", member);
		return "exam06/index";
	}
	
	@RequestMapping("/method5GetObject")
	public String method5GetObject(HttpSession session)
	{

		//HttpSession에 객체 얻기
		Member member = (Member)session.getAttribute("member");
		if(member!=null){
		System.out.println("mid: "+member.getMid());
		System.out.println("mname: "+member.getMname());
		}
		return "exam06/index";
	}
	
	@RequestMapping("/method5RemoveObject")
	public String method5RemoveObject(HttpSession session)
	{

		//HttpSession에 객체 삭제
		
		session.removeAttribute("member");
		
		return "exam06/index";
	}
}

