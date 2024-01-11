package com.spring.web.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.web.board.dto.BoardDTO;

public interface BoardMapper {
	
	// 총 게시물 수를 조회하는 기능
	public int searchCount(@Param("searchWord")String searchWord, 
							@Param("key")String key);
	
	// 작성자 // 제목만 // 내용만 // 제목 + 내용 //
	// 검색에 사용되는 게시판 목록을 가져오는 기능
	public List<BoardDTO> boardList(@Param("searchWord")String searchWord, 
									@Param("key")String key, 
									@Param("postStart")int postStart, 
									@Param("postEnd")int postEnd);
	
	public int boardInsert(BoardDTO dto);
	
	public BoardDTO boardContent(int id);
	
	public void upViewCount(int id);
	
	public int boardModify(BoardDTO dto);
	
	public int boardDelete(int id);
	
	
}
