package com.spring.aop.ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BankMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:aopConfig01.xml");
		
		Bank myBank = context.getBean("bank", Bank.class);
		
		myBank.deposit();
		
		System.out.println();
		
		myBank.withdraw();
		
		context.close();
		
	}

}
