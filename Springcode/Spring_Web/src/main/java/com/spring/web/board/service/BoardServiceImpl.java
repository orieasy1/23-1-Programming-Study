package com.spring.web.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.web.board.dto.BoardDTO;
import com.spring.web.board.mapper.BoardMapper;
import com.spring.web.board.paging.Paging;
import com.spring.web.board.search.SearchVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public List<BoardDTO> boardList(Integer currentPage, 
									SearchVO search, 
									Model model) {
		
		int totalCount =  
				mapper.searchCount(search.getSearchWord(), search.getKey());
		
		Paging paging = new Paging(totalCount, currentPage, search);
		
		int postStart = 
				(paging.getCurrentPage() -1) * Paging.VIEW_POSTS_NUM + 1;
		
		int postEnd = paging.getCurrentPage() * Paging.VIEW_POSTS_NUM;
		
		List<BoardDTO> list =  mapper.boardList(search.getSearchWord(), 
								search.getKey(), 
								postStart, 
								postEnd);
		
		model.addAttribute("paging", paging);
		
		return list;
		
	}

	@Override
	public int boardInsert(BoardDTO dto) {
		return mapper.boardInsert(dto);
	}

	@Override
	public BoardDTO boardContent(Integer id) {
		
		if(id == null) {
			return null;
		}else {
			upViewCount(id);
			return mapper.boardContent(id);
		}
		
	}

	@Override
	public void upViewCount(Integer id) {
		
		mapper.upViewCount(id);

	}

	@Override
	public int boardModify(BoardDTO dto) {
		if(dto == null) {
			return 0;
		}else {
			return mapper.boardModify(dto);
		}
	}

	@Override
	public int boardDelete(Integer id) {
		
		if(id == null) {
			return 0;
		}else {
			return mapper.boardDelete(id);
		}
		
	}

}
