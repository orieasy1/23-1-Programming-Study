package com.spring.db.board.dao;

import java.util.List;

import com.spring.db.board.dto.BoardDTO;

public interface BoardDAO {
	
	// 게시판 목록을 보여주기 위해 BOARD 테이블의 
	// 데이터를 얻어오는 메소드
	public List<BoardDTO> boardList();
	
	// 글 작성후 데이터를 매개변수로 받아 
	// 데이터를 DB에 넣는 메소드
	public int boardInsert(BoardDTO dto);
	
	// 제목 클릭시에 해당하는 글 내용을 보여주기 위해 데이터를 얻는 메소드
	// (id를 매개변수로 받는다.)
	public BoardDTO boardContent(int id);
	
	// 조회수를 1 증가시켜주는 메소드 (id를 매개변수로 받는다.)
	public void upViewCount(int id);
	
	// 게시판 글 수정하는 메소드 (수정 데이터를 매개변수로 받는다.) 
	public int boardModify(BoardDTO dto);
	
	// 게시판 글 삭제하는 메소드 (id를 매개변수로 받는다.)
	public int boardDelete(int id);
	
	

}
