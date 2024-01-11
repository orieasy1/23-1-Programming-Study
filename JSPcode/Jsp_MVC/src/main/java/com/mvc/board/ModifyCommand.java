package com.mvc.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ModifyCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String bId = request.getParameter("bId");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		BoardDTO dto = new BoardDTO();
		
		dto.setbId(Integer.parseInt(bId));
		dto.setbTitle(bTitle);
		dto.setbContent(bContent);
		
		BoardDAO dao = BoardDAO.getInstance();
		
		int result = dao.boardUpdate(dto);
		
		String msg = null;
		String url = null;
		
		if(result == 1) {
			
			msg = "글이 수정되었습니다.";
			
		}else {
			
			msg = "글이 수정되지 않았습니다.";
			
		}
		
		url = "/list.do";
		
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		
		return "board/message.jsp";
	}

}
