package com.spring.di.ex01;

public class ChickenOrder {
	
	private ChickenHouse chicken;
	// 인터페이스 타입으로 설정하면 객체들의 타입을 통일시켜 주어
	// 개발코드는 인터페이스의 메소드만 호출하면 된다.
	// 즉 객체를 구현하는 코드와 객체를 사용하는 코드를 완전히 분리시켜
	// 객체를 사용하는 코드를 수정할 필요가 없다. (유지보수가 쉬워진다.)
	
	public ChickenOrder() {
		
		//chicken = new BBQChicken();
		chicken = new BHCChicken();
	}
	
	public ChickenOrder(ChickenHouse chicken) {
		this.chicken = chicken;
	}
	
	// DI(Dependency Injection) 란.
	// 의존하는 객체를 직접 생성하는 대신 의존객체를 전달받는 방식이다.
	// 사용이유 : 의존객체의 변경의 유연함 때문이다.
	// (의존객체가 여러 클래스에서 쓰였을때 의존객체를 전달해주는 코드만 변경하면 된다.)
	
	public void chickenOrder() {
		System.out.println("치킨을 주문합니다.");
		chicken.chickenCook();
	}
	
	// dependency (의존) 이란
	// A클래스의 기능을 사용할때 B클래스의 기능을 이용하는 것을 말한다.
	// A객체가 B객체에 의존한다. 라고 말한다.
	// 즉 B객체의 기능을 사용하지 않으면 작동할 수 없다.
	// B객체의 기능이 변경되면 A객체에 영향을 미친다.
	
	
}
