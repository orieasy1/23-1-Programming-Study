package com.spring.di.ex03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext(
						"classpath:applicationConfig03.xml", 
						"classpath:applicationConfig03_1.xml");
		// 스프링 설정 파일을 여러개 설정하여 컨테이너를 생성할 수 있다.
		
		MemberService service = context.getBean("myMemberService", MemberService.class);
		
		service.memberProfile();
		
		
		// Spring은 객체들을 기본적으로 싱글톤화 시켜 관리해준다.
		// 싱글톤 : 조회할 때마다 클라이언트에게 같은 빈을 반환해준다.
		
		Member member1 = context.getBean("myMember", Member.class);
		Member member2 = context.getBean("myMember", Member.class);
		
		if(member1 == member2) {
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
		
		System.out.println("아이디 : " + member1.getId());
		System.out.println("----------------------");
		member2.setId("sung");
		
		System.out.println("아이디 : " + member1.getId());
		
		context.close();
	}

}




