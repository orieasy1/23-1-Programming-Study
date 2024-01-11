package com.spring.db.movie.dto;

public class MovieMemberDTO {
	
//	USER_ID	VARCHAR2(20 BYTE)
//	USER_PW	VARCHAR2(20 BYTE)
//	USER_NAME	NVARCHAR2(20 CHAR)
//	POINT	NUMBER
	
	private String userId;
	private String userPw;
	private String userName;
	private int point;
	
	public MovieMemberDTO() {
		
	}

	public MovieMemberDTO(String userId, String userPw, String userName, int point) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.point = point;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	
	
}
