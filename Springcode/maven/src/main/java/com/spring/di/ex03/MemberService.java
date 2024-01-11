package com.spring.di.ex03;

public class MemberService {
	
	private Member member;
	
	public void setMember(Member member) {
		this.member = member;
	}
	
	public void memberProfile() {
		
		System.out.println("----------------------");
		System.out.println("아이디 : " + member.getId());
		System.out.println("비밀번호 : " + member.getPw());
		System.out.println("이름 : " + member.getName());
		System.out.println("나이 : " + member.getAge());
		System.out.println("----------------------");
		
	}
	
}


