package com.spring.mvc.member.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	List<MemberVO> list = new ArrayList<>();
	
	@Override
	public List<MemberVO> memberList() {
		return list;
	}

	@Override
	public boolean memberInsert(MemberVO member) {
		
		if(list.add(member)) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean memberIdCheck(String id) {
		
		for(int i = 0; i < list.size(); i++) {
			
			MemberVO member = list.get(i);
			
			if(member.getId().equals(id)) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public MemberVO getMember(String id) {
		
		for(int i = 0; i < list.size(); i++) {
			
			MemberVO member = list.get(i);
			
			if(member.getId().equals(id)) {
				
				return member;
				
			}
		}
		
		return null;
	}

	@Override
	public boolean memberModify(MemberVO member) {
		
		for(int i = 0; i < list.size(); i++) {
			
			MemberVO modify = list.get(i);
			
			if(modify.getId().equals(member.getId())) {
				
				modify.setPw(member.getPw());
				modify.setTel(member.getTel());
				modify.setEmail(member.getEmail());
				modify.setAddress(member.getAddress());
				
				return true;
			}
			
		}
		
		return false;
	}

	@Override
	public boolean memberDelete(String id) {
		
		for(int i = 0; i < list.size(); i++) {
			
			MemberVO member = list.get(i);
			
			if(member.getId().equals(id)) {
				
				list.remove(i);
				return true;
				
			}
			
		}
		
		return false;
	}

}





