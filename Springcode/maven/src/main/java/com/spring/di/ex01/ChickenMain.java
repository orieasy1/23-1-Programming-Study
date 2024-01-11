package com.spring.di.ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ChickenMain {

	public static void main(String[] args) {
		
//		ChickenOrder order = new ChickenOrder();
//		order.chickenOrder();
		
		ChickenOrder order2 = new ChickenOrder(new BHCChicken());
		
		order2.chickenOrder();
		
		// 스프링에서는 의존객체를 생성하고 서로 연결(조립, 주입) 해주는 
		// 컨테이너가 바로 IoC 컨테이너 이다.
		// 컨테이너에 의존 객체들을 설정하는 설정파일은 xml 파일과 자바파일이 있다.
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:applicationConfig01.xml");
		
		// GenericXmlApplicationContext 클래스는 xml 파일에 정의된
		// 설정정보를 읽어와서 객체를 생성하고 각각의 객체를 연결한 뒤에 
		// 내부적으로 보관한다. 빈 객체를 (이름, 객체) 의 형태로 보관한다.
		
		ChickenOrder order3 = context.getBean("myOrder", ChickenOrder.class);
		
		order3.chickenOrder();
		
		context.close();
		
	}

}









