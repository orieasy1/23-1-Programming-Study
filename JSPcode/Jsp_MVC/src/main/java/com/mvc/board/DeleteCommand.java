package com.mvc.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String bId = request.getParameter("bId");
		
		BoardDAO dao = BoardDAO.getInstance();
		
		int result = dao.boardDelete(Integer.parseInt(bId));
		
		String msg = null;
		String url = null;
		
		if(result == 1) {
			msg = "글이 삭제되었습니다.";
		}else {
			msg = "글이 삭제되지 않았습니다.";
		}
		
		url = "/list.do";
		
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		
		
		return "board/message.jsp";
	}

}
