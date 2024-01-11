package com.jsp.kgmember;

import java.sql.Timestamp;

public class MemberDTO {
	
	// DTO : Data Transfer Object
	// 계층간 데이터 교환을 위한 자바빈 객체
	
//	ID	VARCHAR2(50 BYTE)
//	PW	VARCHAR2(50 BYTE)
//	NAME	NVARCHAR2(50 CHAR)
//	EMAIL	VARCHAR2(50 BYTE)
//	REGDATE	TIMESTAMP(6)
//	ADDRESS	NVARCHAR2(50 CHAR)
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private Timestamp regDate;
	private String address;
	
	// 기본생성자 : 필수
	public MemberDTO() {
		
	}
	
	// 초기화 생성자 : 선택
	public MemberDTO(String id, String pw, String name, String email, Timestamp regDate, String address) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.regDate = regDate;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
}
