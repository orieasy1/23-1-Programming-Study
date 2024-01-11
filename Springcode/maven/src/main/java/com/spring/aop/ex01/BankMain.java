package com.spring.aop.ex01;

public class BankMain {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.deposit();
		
		System.out.println();
		
		bank.withdraw();
		

	}

}
