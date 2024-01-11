package com.spring.di.ex05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig02 {
	
	@Bean(name = "myMember")
	public Member myMember() {
		
		Member member = new Member("hong", "1234");
		
		member.setName("홍길동");
		member.setAge(20);
		
		return member;
	}
	
	@Bean(name = "service")
	public MemberService service() {
		
		return new MemberService(myMember());
	}
	
}
