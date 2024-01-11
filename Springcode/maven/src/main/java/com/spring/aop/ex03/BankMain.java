package com.spring.aop.ex03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BankMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:aopConfig02.xml");
		
		Bank bank = context.getBean("bank", Bank.class);
		
		bank.deposit();
		
		System.out.println();
		
		bank.withdraw();
		
		context.close();

	}

}
