package com.spring.di.ex05;

public class MemberService {
	
	private Member member;
	
	public MemberService(Member member) {
		this.member = member;
	}
	
	public void memberProfile() {
		
		System.out.println("--------------------------");
		System.out.println("아이디 : " + member.getId());
		System.out.println("비밀번호 : " + member.getPw());
		System.out.println("이름 : " + member.getName());
		System.out.println("나이 : " + member.getAge());
		System.out.println("--------------------------");
		
	}
	
	public void loginInfo() {
		
		if(member == null) {
			System.out.println("회원이 등록되어있지 않습니다.");
			return;
		}
		
		if(member.getId() != null && member.getPw() != null) {
			
			System.out.println("로그인 되었습니다.");
			System.out.println("로그인 된 아이디 : " + member.getId());
			System.out.println("로그인 된 비밀번호 : " + member.getPw());
			
		}else {
			System.out.println("로그인 실패입니다.");
		}
		
		
	}
	
	
}
