package com.java.freeboard;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
/*
 * 어노테이션은 주석이지만 스프링이 무시하지 않음.
 */
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	//로그 불러오는 수식
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = {RequestMethod.GET,RequestMethod.POST})
	//*** 요청 보내는 방식을 정하는 코드 : get방식과 post방식을 결정할 수 있음.
	public String home(Locale locale, Model model) {
		//***모델 : 키와 값으로 구성,담아주는 역할, 키를 통해 값을 꺼낼 수 있음. 
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
		/*
		 * 1.서버실행
		 * 2.modules path 경로 실행
		 * 3.path "/"가 @RequestMapping value에 찍힘
		 * 4.home 메서드 실행
		 * 5.model.~ 통해 serverTime 값을 home.jsp 전달(return 값 : home이기 때문)
		 * 6.home.jsp 대로 화면단 띄움.
		 */
	}
	
}
