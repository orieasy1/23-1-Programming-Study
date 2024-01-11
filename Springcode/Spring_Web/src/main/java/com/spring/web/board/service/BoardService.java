package com.spring.web.board.service;

import java.util.List;

import org.springframework.ui.Model;

import com.spring.web.board.dto.BoardDTO;
import com.spring.web.board.search.SearchVO;

public interface BoardService {
	
	public List<BoardDTO> boardList(Integer currentPage, 
									SearchVO search, 
									Model model);
	
	public int boardInsert(BoardDTO dto);
	
	public BoardDTO boardContent(Integer id);
	
	public void upViewCount(Integer id);
	
	public int boardModify(BoardDTO dto);
	
	public int boardDelete(Integer id);
	
}
