package com.mycompany.myapp2.exam07;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/exam07")
public class Exam07Controller {

	
	private static final Logger logger = LoggerFactory.getLogger(Exam07Controller.class);
	@RequestMapping("/index")
	public String index()
	{
		logger.info("exam07 index 처리");
		return "exam07/index";
	}
	
	@RequestMapping("/method1")
	public String method1(HttpServletRequest rq)
	{
		logger.info("exam07 method1 처리");
		rq.setAttribute("data1", "value1");
		rq.setAttribute("data2", "value2");
		return "exam07/userdata";
	}
	
	@RequestMapping("/method2")
	public String method2(HttpSession session)
	{
		logger.info("exam07 method2 처리");
		session.setAttribute("data1", "value1");
		session.setAttribute("data2", "value2");
		
		return "exam07/userdata";
	}
	
	@RequestMapping("/method3")
	public String method3(Model model)
	{
		model.addAttribute("data1", "value1");
		model.addAttribute("data2", "value2");
		return "exam07/userdata";
	}
	
	@RequestMapping("/method4")
	public String method4(Model model)
	{
		Board board = new Board();
		board.setBno(1);
		board.setTitle("오늘은 목요일");
		board.setContent("실력을 키우도록 해요");
		board.setHitcount(3);
		model.addAttribute("board", board);
		return "exam07/userdata";
	}
	
	@RequestMapping("/method5")
	public String method5 (Model model)
	{
		List<Board> list = new ArrayList<>();
		
		for(int i=1; i<5;i++)
		{
			Board board = new Board();
			board.setBno(i);
			board.setTitle("제목"+i);
			board.setContent("내용"+i);
			board.setHitcount(1);
			list.add(board);
		}
		model.addAttribute("boardlist",list);
		return "exam07/userdata";
		}
	
}
