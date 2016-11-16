package com.mycompany.myweb.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myweb.dto.Food;
import com.mycompany.myweb.dto.Light;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/") //  "/" 의 의미는 홈페이지 주소의 context 뒤에 들어간다. 그리고 /+리턴값이 된다.
	public String index() { //변수이름은 중요하지 않다.
		logger.info("index() 실행"); //views 의 home.jsp 와 같은거다

		return "index";
	}
	
	@RequestMapping("/home") //  "/" 의 의미는 홈페이지 주소의 context 뒤에 들어간다. 그리고 /+리턴값이 된다.
	public String home() { //변수이름은 중요하지 않다.
		logger.info("home() 실행"); //views 의 home.jsp 와 같은거다

		return "home";
	}
	
	@RequestMapping("/foodList")
	public String foodList(Model model)
	{
		List<Food> list = new ArrayList<>();
		list.add(new Food("food01.png", "food01_large.png", "Name", "35,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Food("food02.png", "food02_large.png", "Name", "27,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Food("food03.png", "food03_large.png", "Name", "28,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Food("food04.png", "food04_large.png", "Name", "56,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Food("food05.png", "food05_large.jpg", "Name", "30,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Food("food01.png", "food01_large.png", "Name", "35,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Food("food02.png", "food02_large.png", "Name", "27,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Food("food03.png", "food03_large.png", "Name", "28,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Food("food04.png", "food04_large.png", "Name", "56,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Food("food05.png", "food05_large.jpg", "Name", "30,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		
		model.addAttribute("foodList",list);
		return "foodList";
	}
	
	@RequestMapping("/lightList")
	public String lightList(Model model){
		List<Light> list = new ArrayList<>();
	  /*list.add(new Light("light1.png", "light1_large.png", "인테리어 조명1", "거실등으로 사용하면 좋습니다."));
		list.add(new Light("light2.png", "light2_large.png", "인테리어 조명2", "거실등으로 사용하면 좋습니다."));
		list.add(new Light("light3.png", "light3_large.png", "인테리어 조명3", "거실등으로 사용하면 좋습니다."));
		list.add(new Light("light4.png", "light4_large.png", "인테리어 조명4", "거실등으로 사용하면 좋습니다."));
		list.add(new Light("light5.png", "light5_large.png", "인테리어 조명5", "거실등으로 사용하면 좋습니다."));
		list.add(new Light("light1.png", "light1_large.png", "인테리어 조명6", "거실등으로 사용하면 좋습니다."));
		list.add(new Light("light2.png", "light2_large.png", "인테리어 조명7", "거실등으로 사용하면 좋습니다."));
		list.add(new Light("light3.png", "light3_large.png", "인테리어 조명8", "거실등으로 사용하면 좋습니다."));
		list.add(new Light("light4.png", "light4_large.png", "인테리어 조명9", "거실등으로 사용하면 좋습니다."));
		list.add(new Light("light5.png", "light5_large.png", "인테리어 조명10", "거실등으로 사용하면 좋습니다."));
		*/
		list.add(new Light("food1.png", "food1_large.png", "Name", "35,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Light("food2.png", "food2_large.png", "Name", "27,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Light("food3.png", "food3_large.png", "Name", "28,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Light("food4.png", "food4_large.png", "Name", "56,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Light("food5.png", "food5_large.png", "Name", "30,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Light("food1.png", "food1_large.png", "Name", "35,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Light("food2.png", "food2_large.png", "Name", "27,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Light("food3.png", "food3_large.png", "Name", "28,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Light("food4.png", "food4_large.png", "Name", "56,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		list.add(new Light("food5.png", "food5_large.png", "Name", "30,000 Won","Information about popular Korean food dishes and local restaurant listings in the Tri-state area."));
		
		model.addAttribute("list",list);
		return "lightList";
	}
	
	@RequestMapping("/getImage")
	public void getImage(String fileName, HttpServletRequest request, HttpServletResponse response){
		try{
			String mimeType = request.getServletContext().getMimeType(fileName);//파일의 확장명을 보고 .확장명(Mime)을 리턴해줌
			response.setContentType(mimeType);
			
			OutputStream os = response.getOutputStream();
			
			String filePath =  request.getServletContext().getRealPath("resources/image/"+fileName);
			InputStream is = new FileInputStream(filePath);
			
			byte[] values = new byte[1024];
			int byteNum=-1;
			while((byteNum=is.read(values))!=-1){
				os.write(values,0,byteNum);
			}
			os.flush();
			is.close();
			os.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
