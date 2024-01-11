package com.spring.db.board.service;

import java.util.List;

import com.spring.db.board.dto.BoardDTO;

public interface BoardService {
	
	public List<BoardDTO> boardList();
	
	public int boardInsert(BoardDTO dto);
	
	public BoardDTO boardContent(Integer id);
	
	public void upViewCount(Integer id);
	
	public int boardModify(BoardDTO dto);
	
	public int boardDelete(Integer id);
	
}
