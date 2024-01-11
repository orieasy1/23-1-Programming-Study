package com.spring.mvc.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
	
	// @RequestMapping : ContextPath 다음에 해당하는 url과 
	//					해당하는 요청방식으로 요청이 들어오면 메소드를 실행시켜 준다.
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list() {
		
		System.out.println("PageController의 list 메소드 입니다.");
		
		return "page/listPage";
		// 문자열로 /WEB-INF/views 폴더안에 있는 확장자를 제외한 
		// jsp 파일의 경로를 문자열로 반환하면 
		// 그것을 디스패쳐 서블릿이 받아 뷰 리졸버를 호출하여 준다. 
		// 뷰 리졸버는 클라이언트에게 실제로 응답을 해줄 자원의 경로로 바꾸어 준다. 
		// /WEB-INF/views/ + "page/listPage" + .jsp
	}
	
	//@RequestMapping(value="/form", method=RequestMethod.GET)
	@GetMapping("/form")
	public String formEx() {
		return "page/formEx";
	}
	
	// post 방식의 url 요청이 들어오면 해당 메소드 실행 
	//@RequestMapping(value="/write", method=RequestMethod.POST)
	@PostMapping("/write")
	public String write() {
		return "page/write";
	}
	
	
}





