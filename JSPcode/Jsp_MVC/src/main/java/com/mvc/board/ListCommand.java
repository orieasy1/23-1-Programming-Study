package com.mvc.board;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		// DAO 객체를 사용하여 ArrayList<BoardDTO> 를 얻은 후 
		// request 객체에 바인딩하기
		
		BoardDAO dao = BoardDAO.getInstance();
		
		ArrayList<BoardDTO> list = dao.boardList();
		
		request.setAttribute("list", list);
		
		return "board/list.jsp";
	}

}
