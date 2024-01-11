package com.spring.di.ex04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 스프링 IoC 컨테이너가 해당 클래스파일을 스프링 설정파일로 사용할 수 있도록
// 클래스 위에 @Configuration 어노테이션을 붙여준다.
@Configuration
public class ApplicationConfig {
	
	// @Bean 어노테이션을 사용하여 해당 메소드가 반환하는 객체를
	// 스프링이 관리하는 빈 객체로 등록.
	@Bean
	public Pet myPet() {
		
		Pet pet = new Pet("야옹이3", "멍멍이3");
		
		pet.setFish("니모3");
		pet.setDuck("꽥꽥이3");
		
		return pet;
		
	}
	
	@Bean(name = "myPetProfile")
	public PetProfile petPro() {
		
		return new PetProfile(myPet());
		
//		Pet pet = myPet();
//		PetProfile petPro = new PetProfile(pet);
//		return petPro;
		
	}
	
}







