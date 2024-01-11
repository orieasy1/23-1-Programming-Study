package com.spring.mvc.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/student")
@Controller
public class StudentController {
	
	@GetMapping("/form1")
	public String studentForm1() {
		return "student/studentForm01";
	}
	
	@PostMapping("/data1")
	public String studentData1(@ModelAttribute("student")Student student, Model model) {
		// 화면처리를 위한 jsp 파일에 데이터를 보낼때 사용되는 Model 객체에 
		// 데이터를 넣는 방식 중 받은 데이터를 바로 @ModelAttribute 
		// 어노테이션을 사용하여 간편하게 Model 객체에 데이터를 넣을 수 있다.
		
		
		//model.addAttribute("student", student);
		
		return "student/studentData01";
	}
	
	@GetMapping("/form2")
	public String studentForm2() {
		return "student/studentForm02";
	}
	
	// ModelAndView 객체를 통한 화면과 데이터 전송하기
	
	@PostMapping("/data2")
	public ModelAndView studentData2(Student student) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("student/studentData02");
		mv.addObject("student", student);
		
		return mv;
	}
	
	
}





