package com.spring.db.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.db.board.dao.BoardDAO;
import com.spring.db.board.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	@Qualifier("dao2")
	private BoardDAO dao;
	
	@Override
	public List<BoardDTO> boardList() {
		return dao.boardList();
	}

	@Override
	public int boardInsert(BoardDTO dto) {
		
		int result = 0;
		
		if(dto != null) {
			result = dao.boardInsert(dto);
		}else {
			result = 0;
		}
		
		return result;
	}

	@Override
	public BoardDTO boardContent(Integer id) {
		
		if(id != null) {
			upViewCount(id);
			return dao.boardContent(id);
		}else {
			return null;
		}
		
	}

	@Override
	public void upViewCount(Integer id) {
		dao.upViewCount(id);
	}

	@Override
	public int boardModify(BoardDTO dto) {
		int result = 0;
		
		if(dto != null) {
			result = dao.boardModify(dto);
		}else {
			result = 0;
		}
		
		return result;
	}

	@Override
	public int boardDelete(Integer id) {
		
		int result = 0;
		if(id != null) {
			result = dao.boardDelete(id);
		}else {
			result = 0;
		}
		
		return result;
	}

}
