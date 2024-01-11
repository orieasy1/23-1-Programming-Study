package com.spring.db.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.db.board.dto.BoardDTO;
import com.zaxxer.hikari.HikariDataSource;

@Repository("dao1")
public class BoardDAOImpl implements BoardDAO {
	
	private Connection conn;
	// DB와 연결성을 갖는 객체
	private PreparedStatement pstmt;
	// DB에 Data에 접근하여 CRUD 를 처리하는 객체
	private ResultSet rs;
	// 조회결과 Data를 갖는 객체
	
	@Autowired // 빈 자동 주입
	private HikariDataSource ds;
	// Connection Pool을 관리하는 객체
	
	@Override
	public List<BoardDTO> boardList() {
		
		List<BoardDTO> list = new ArrayList<>();
		
		String query = "SELECT * FROM BOARD ORDER BY ID DESC";
		
		try {
			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
//			ID	NUMBER(4,0)
//			WRITER	NVARCHAR2(20 CHAR)
//			TITLE	NVARCHAR2(100 CHAR)
//			CONTENT	NVARCHAR2(500 CHAR)
//			REG_DATE	TIMESTAMP(6)
//			VIEW_COUNT	NUMBER(4,0)
			
			while(rs.next()) {
				// next : 다음 레코드가 있는지 확인 후 다음 레코드가 없다면 false
				// 다음 레코드가 있다면 true 반환 후 커서를 다음 레코드로 이동
				
				int id = rs.getInt("ID");
				String writer = rs.getString("WRITER");
				String title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				Timestamp regDate = rs.getTimestamp("REG_DATE");
				int viewCount = rs.getInt("VIEW_COUNT");
				
				list.add(new BoardDTO(id, writer, title, content, regDate, viewCount));
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
				
			}catch(Exception e2) {}
			
		}
		
		
		return list;
	}

	@Override
	public int boardInsert(BoardDTO dto) {
		
		int result = 0;
		
		String query = "INSERT INTO BOARD(ID, WRITER, TITLE, CONTENT) "
				+ "VALUES(BOARD_SEQ.NEXTVAL, ?, ?, ?)";
		
		try {
			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
				
			}catch(Exception e2) {}
			
		}
		
		
		return result;
	}

	@Override
	public BoardDTO boardContent(int id) {
		
		BoardDTO dto = null;
		
		String query = "SELECT * FROM BOARD WHERE ID = ?";
		
		try {
			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				id = rs.getInt("ID");
				String writer = rs.getString("WRITER");
				String title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				Timestamp regDate = rs.getTimestamp("REG_DATE");
				int viewCount = rs.getInt("VIEW_COUNT");
				
				dto = new BoardDTO(id, writer, title, content, regDate, viewCount);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
				
			}catch(Exception e2) {}
			
		}
		
		return dto;
	}

	@Override
	public void upViewCount(int id) {
		
		String query = "UPDATE BOARD SET "
				+ "VIEW_COUNT = VIEW_COUNT + 1 WHERE ID = ?";
		
		try {
			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			
			try {
				
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
				
			}catch(Exception e2) {}
			
		}

	}

	@Override
	public int boardModify(BoardDTO dto) {
		
		int result = 0;
		
		String query = "UPDATE BOARD SET TITLE = ?, CONTENT = ? "
				+ "WHERE ID = ?";
		
		try {
			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getId());
			
			result = pstmt.executeUpdate();
			// executeUpdate : 변경된 레코드의 수 반환
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(pstmt != null)pstmt.close();
				if(conn != null) conn.close();
				
			}catch(Exception e2) {}
			
		}
		
		
		return result;
	}

	@Override
	public int boardDelete(int id) {
		
		int result = 0;
		
		String query = "DELETE FROM BOARD WHERE ID = ?";
		
		try {
			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, id);
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
				
			}catch(Exception e2) {}
			
		}
		
		return result;
	}

}




