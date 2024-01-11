package com.spring.di.ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:applicationConfig02.xml");
		
		StudentService service = context.getBean("studentService", StudentService.class);
		
		service.studentProfile();
		
		context.close();
		
	}

}
