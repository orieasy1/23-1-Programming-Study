package com.spring.di.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// @Autowired : 객체를 자동 주입할때 사용하는 어노테이션
// 의존 객체의 타입에 해당하는 Bean 을 찾아 주입한다.
// 필드, 생성자, 메소드 주입방식이 있다.


public class PetProfile {
	
	// 타입으로 의존객체를 찾아 주입하기 때문에 @Qualifier 어노테이션으로
	// 빈의 아이디를 지정해서 어떤 빈을 선택하는지 알려준다.
	@Qualifier("myPet2")
	@Autowired(required = false)
	// false로 지정하면 빈 객체가 존재하지 않더라도 예외를 발생X
	private Pet pet;
	
	// 기본생성자
	public PetProfile() {
		
	}
	
	//@Autowired
	public PetProfile(Pet pet) {
		this.pet = pet;
	}
	
	// setter 메소드
	//@Autowired
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	
	public void petProfileList() {
		
		if(pet == null) {
			System.out.println("나의 애완동물은 없습니다.");
			return;
		}
		
		System.out.println("### 나의 애완동물 리스트 ###");
		System.out.println("강아지 : " + pet.getDog());
		System.out.println("고양이 : " + pet.getCat());
		System.out.println("물고기 : " + pet.getFish());
		System.out.println("오리  : " + pet.getDuck());
		System.out.println("#########################");
		
		
	}

}
