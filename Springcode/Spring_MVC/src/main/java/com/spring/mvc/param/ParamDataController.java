package com.spring.mvc.param;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/param")
@Controller
public class ParamDataController {
	
	
	@RequestMapping("/el")
	public String el() {
		return "param/elPractice";
	}
	
	
	//@RequestMapping(value="/form01", method=RequestMethod.GET)
	@GetMapping("/form01")
	public String paramForm01() {
		return "param/paramForm01";
	}
	
	@PostMapping("/data1")
	public String paramData01(HttpServletRequest request) throws Exception {
		
		//request.setCharacterEncoding("UTF-8");
		// 매번 해야하는 한글처리를 web.xml에 filter 로 등록하여
		// 한글 인코딩 처리를 할 수 있다.
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		//int age2 = Integer.parseInt(age);
		
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		
		return "param/paramPrint";
		
	}
	
	@GetMapping("/form02")
	public String paramForm02() {
		return "param/paramForm02";
	}
	
	// @RequestParam 어노테이션을 사용하여 넘어오는 파라미터의 값을 받을 수 있다.
	// 필수가 아닌 파라미터의 경우, required=false 로 설정을 해주면
	// 넘어오는 파라미터의 이름의 데이터가 없는경우 예외를 발생시키지 않고 
	// null 값이 변수에 저장되어진다.
	@PostMapping("/data2")
	public String paramData02(@RequestParam(value="name", required=false, defaultValue="홍길동")String name, 
								@RequestParam(value="age", required=false, defaultValue="20")Integer age, 
								Model model) {
		
		// Model 객체 : Controller에서 생성한 데이터를 담아서 view 로 
		// 전달할때 사용되는 객체이다. 서블릿의 request 와 같은 역할
		// addAttribute("이름", 값) 메소드로 전달할 데이터를 셋팅
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "param/paramPrint";
	}
	
	
	@GetMapping("/form03")
	public String paramForm03() {
		return "param/paramForm03";
	}
	
	// 스프링에서 HttpServletRequest 를 통해 전송정보를 얻을 수도 있고,
	// @RequestParam 어노테이션으로 데이터를 해당 
	// 매개변수에 바인딩하여 전송정보를 얻을 수도 있다.
	// 하지만 이 두 방식은 파라미터 갯수들이 많아지면 하나하나 명시를 하여 처리해야 되어 
	// 가독성이 떨어지는 등의 단점이 있다.
	// 따라서 스프링은 커맨드 객체(Command Object)를 지원하고 있다.
	// http 요청 파라미터의 이름을 사용한 setter 메소드를 작성한 클래스를 만들고
	// 이 클래스의 객체(커맨드 객체)를 메소드의 매개변수에 작성을 해주면
	// 파라미터의 값들이 객체의 속성값으로 자동으로 바인딩 되어 전송정보를 얻을 수 있다.
	
	@PostMapping("/data3")
	public String paramData03(ParamMember member, Model model) {
		
		System.out.println("이름 : " + member.getName());
		System.out.println("나이 : " + member.getAge());
		
		model.addAttribute("member", member);
		
		return "param/paramPrint";
	}
	
	
}









