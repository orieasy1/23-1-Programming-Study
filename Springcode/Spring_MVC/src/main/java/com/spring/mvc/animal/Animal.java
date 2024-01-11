package com.spring.mvc.animal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


// 공통 URL 지정 예 >> /animal/cat
@RequestMapping("/animal")
@Controller
public class Animal {
	
	@GetMapping("/cat")
	public String Cat() {
		return "animal/cat";
	}
	
	@GetMapping("/dog")
	public String dog() {
		return "animal/dog";
	}
	
	@GetMapping("/duckForm")
	public String duckForm() {
		return "animal/duckForm";
	}
	
	@PostMapping("/duck")
	public String duck() {
		return "animal/duck";
	}
	
}
