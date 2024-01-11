package com.spring.db.movie.dao;

import com.spring.db.movie.dto.MovieMemberDTO;

public interface MovieMemberDAO {
	
	public static final int MOVIE_PRICE = 10000;
	
	// 회원 로그인 메소드
	public int loginCheck(String userId, String userPw);
	
	// 영화이켓 구입 메소드
	public void buyTicket(String userId, int ticketNumber);
	
	// 회원의 정보를 얻는 메소드
	public MovieMemberDTO getMember(String userId);
	
	// 티켓수 얻는 메소드
	public int getTicketNumber(String userId);
	
	
	
}
