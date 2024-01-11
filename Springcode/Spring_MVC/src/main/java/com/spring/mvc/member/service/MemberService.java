package com.spring.mvc.member.service;

import java.util.List;

import com.spring.mvc.member.repository.MemberVO;

public interface MemberService {
	
	// 회원 목록 전체를 조회하는 메소드
	public List<MemberVO> memberList();
	
	// 회원가입 후 회원 데이터를 넣는메소드
	public boolean memberInsert(MemberVO member);
	
	// 회원가입 전 같은 아이디가 있는지 체크하는 메소드
	public boolean memberIdCheck(String id);
	
	// 해당 1명의 회원의 정보를 얻는 메소드
	public MemberVO getMember(String id);
	
	// 회원정보 수정을 해주는 메소드
	public boolean memberModify(MemberVO member);
	
	// 회원 삭제를 해주는 메소드
	public boolean memberDelete(String id);
	
}
