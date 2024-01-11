package com.spring.di.ex04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class PetMain {

	public static void main(String[] args) {
		
//		GenericXmlApplicationContext context = 
//				new GenericXmlApplicationContext("classpath:applicationConfig04.xml");
//		
//		PetProfile petPro = context.getBean("petPro", PetProfile.class);
//		
//		petPro.petProfileList();
//		
//		
//		context.close();
		
		
		AnnotationConfigApplicationContext context2 = 
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		
		PetProfile petPro = context2.getBean("myPetProfile", PetProfile.class);
		
		petPro.petProfileList();
		
		context2.close();
		
	}

}
