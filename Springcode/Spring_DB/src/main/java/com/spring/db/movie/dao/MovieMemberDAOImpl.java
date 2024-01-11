package com.spring.db.movie.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.spring.db.movie.dto.MovieMemberDTO;

@Repository
public class MovieMemberDAOImpl implements MovieMemberDAO {
	
	@Autowired
	private JdbcTemplate jt;
	
//	@Autowired
//	private PlatformTransactionManager tm;
	
	@Autowired
	private TransactionTemplate tranTemplate;
	
	
	@Override
	public int loginCheck(String userId, String userPw) {
		
		String query = "SELECT USER_PW FROM "
				+ "MOVIE_MEMBER WHERE USER_ID = ?";
		
		String dbPw = jt.queryForObject(query, new RowMapper<String>() {
			
			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				String dbPw = rs.getString("USER_PW");
				
				return dbPw;
			}
			
		}, userId);
		
		if(dbPw == null) { // 아이디가 없는경우
			return -1;
		}else {
			
			if(userPw.equals(dbPw)) { // 아이디, 비밀번호 일치하는 경우
				return 1;
			}else { // 비밀번호가 틀린경우
				return 0;
			}
			
		}
		
	}

	@Override
	public void buyTicket(String userId, int ticketNumber) {
		
//		TransactionDefinition definition = 
//				new DefaultTransactionDefinition();
//		TransactionStatus status = tm.getTransaction(definition);
		// 트랜잭션 실행 및 상태를 제어할 수 있는 방법을 제공해주는 객체
		
//		try {
//			
//			String query1 = "UPDATE MOVIE_MEMBER "
//					+ "SET POINT = POINT - ? WHERE USER_ID = ?";
//			
//			jt.update(query1, MovieMemberDAO.MOVIE_PRICE * ticketNumber, userId);
//			
//			String query2 = "UPDATE MOVIE_TICKET "
//					+ "SET TICKET_NUMBER = TICKET_NUMBER + ? "
//					+ "WHERE USER_ID = ?";
//			
//			jt.update(query2, ticketNumber, userId);
//			
//			tm.commit(status);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//			
//			tm.rollback(status);
//			
//		}
		
		tranTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				
				String query1 = "UPDATE MOVIE_MEMBER "
						+ "SET POINT = POINT - ? WHERE USER_ID = ?";
				
				jt.update(query1, MovieMemberDAO.MOVIE_PRICE * ticketNumber, userId);
				
				String query2 = "UPDATE MOVIE_TICKET "
						+ "SET TICKET_NUMBER = TICKET_NUMBER + ? "
						+ "WHERE USER_ID = ?";
				
				jt.update(query2, ticketNumber, userId);
				
			}
			
		});
		
		
		
		
		
		
		
		
		
		
		
		
	}

	@Override
	public MovieMemberDTO getMember(String userId) {
		
		MovieMemberDTO dto = null;
		
		String query = "SELECT * FROM MOVIE_MEMBER WHERE USER_ID = ?";
		
		dto = jt.queryForObject(query, new RowMapper<MovieMemberDTO>() {
			
			@Override
			public MovieMemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				String userId = rs.getString("USER_ID");
				String userPw = rs.getString("USER_PW");
				String userName = rs.getString("USER_NAME");
				int point = rs.getInt("POINT");
				
				MovieMemberDTO dto = 
						new MovieMemberDTO(userId, userPw, userName, point);
				
				return dto;
			}
			
		}, userId);
		
		return dto;
	}

	@Override
	public int getTicketNumber(String userId) {
		
		String query = "SELECT TICKET_NUMBER FROM MOVIE_TICKET "
				+ "WHERE USER_ID = ?";
		
		int ticketNumber = jt.queryForObject(query, new RowMapper<Integer>() {
			
			@Override
			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				int ticketNumber = rs.getInt("TICKET_NUMBER");
				
				return ticketNumber;
			}
			
		}, userId);
		
		return ticketNumber;
	}

}







