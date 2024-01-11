package com.spring.db.board.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.db.board.dto.BoardDTO;

@Repository("dao2")
public class BoardDAOImpl2 implements BoardDAO {
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<BoardDTO> boardList() {
		
		String query = "SELECT * FROM BOARD ORDER BY ID DESC";
		
		List<BoardDTO> list = jt.query(query, new RowMapper<BoardDTO>() {
			@Override
			public BoardDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				int id = rs.getInt("ID");
				String writer = rs.getString("WRITER");
				String title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				Timestamp regDate = rs.getTimestamp("REG_DATE");
				int viewCount = rs.getInt("VIEW_COUNT");
				
				BoardDTO dto = new BoardDTO(id, writer, title, content, regDate, viewCount);
				
				return dto;
			}
		});
		
		return list;
	}

	@Override
	public int boardInsert(BoardDTO dto) {
		
		String query = "INSERT INTO BOARD(ID, WRITER, TITLE, CONTENT) "
				+ "VALUES(BOARD_SEQ.NEXTVAL, ?, ?, ?)";
		
		return jt.update(query, dto.getWriter(), dto.getTitle(), dto.getContent());
		
	}

	@Override
	public BoardDTO boardContent(int id) {
		
		String query = "SELECT * FROM BOARD WHERE ID = ?";
		
		BoardDTO dto = jt.queryForObject(query, new RowMapper<BoardDTO>() {
			
			@Override
			public BoardDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				int id = rs.getInt("ID");
				String writer = rs.getString("WRITER");
				String title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				Timestamp regDate = rs.getTimestamp("REG_DATE");
				int viewCount = rs.getInt("VIEW_COUNT");
				
				BoardDTO dto = new BoardDTO(id, writer, title, content, regDate, viewCount);
				
				return dto;
			}
			
		}, id);
		
		return dto;
	}

	@Override
	public void upViewCount(int id) {
		
		String query = "UPDATE BOARD SET "
				+ "VIEW_COUNT = VIEW_COUNT + 1 WHERE ID = ?";
		
		jt.update(query, id);

	}

	@Override
	public int boardModify(BoardDTO dto) {
		String query = "UPDATE BOARD SET TITLE = ?, CONTENT = ? "
				+ "WHERE ID = ?";
		return jt.update(query, dto.getTitle(), dto.getContent(), dto.getId());
	}

	@Override
	public int boardDelete(int id) {
		
		String query = "DELETE FROM BOARD WHERE ID = ?";
		
		return jt.update(query, id);
	}

}
