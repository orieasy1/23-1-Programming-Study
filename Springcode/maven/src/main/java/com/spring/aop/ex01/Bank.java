package com.spring.aop.ex01;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Bank {
	
	public static final Logger LOG = Logger.getGlobal();
	
	FileHandler fh;
	
	public Bank() {
		
		try {
			
			fh = new FileHandler("C:\\log\\myLog%g.txt", 2000, 1000, true);
			
			fh.setLevel(Level.ALL);
			
			fh.setFormatter(new SimpleFormatter());
			LOG.addHandler(fh);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void deposit() {
		LOG.info("deposit 메소드 시작!");
		System.out.println("통장에 돈을 입금합니다.");
		LOG.info("deposit 메소드 끝!");
	}
	
	public void withdraw() {
		LOG.info("withdraw 메소드 시작!");
		System.out.println("통장에 돈을 출금합니다.");
		LOG.info("withdraw 메소드 끝!");
	}
	
	
	
}






