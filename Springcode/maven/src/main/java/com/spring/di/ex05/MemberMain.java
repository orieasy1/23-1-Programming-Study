package com.spring.di.ex05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		
		// main메소드에서 스프링 컨테이너 생성 후 
		// MemberService 객체를 얻어와 loginInfo 메소드와
		// memberProfile 메소드 호출하기
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ApplicationConfig02.class);
		
		MemberService service = context.getBean("service", MemberService.class);
		
		service.loginInfo();
		
		service.memberProfile();
		
		context.close();
		
	}

}
