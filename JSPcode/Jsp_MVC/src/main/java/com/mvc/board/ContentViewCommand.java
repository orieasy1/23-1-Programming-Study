package com.mvc.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContentViewCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String bId = request.getParameter("bId");
		
		BoardDAO dao = BoardDAO.getInstance();
		BoardDTO dto = dao.getContent(Integer.parseInt(bId));
		
		request.setAttribute("content", dto);
		
		return "board/contentView.jsp";
	}

}
