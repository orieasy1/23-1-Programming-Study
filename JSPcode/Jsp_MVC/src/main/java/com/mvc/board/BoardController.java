package com.mvc.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// .do : jsp 에서 사용하는 가상의 주소
// 사용자는 파일의 실제경로를 알 수 없으므로 보안에 도움이 된다.

@WebServlet("*.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		System.out.println("Board 컨트롤러 입니다.");
		
		String viewPage = null;
		Command command = null;
		
		String uri = request.getRequestURI();
		
		String conPath = request.getContextPath();
		
		String result = uri.substring(conPath.length());
		
		if(result.equals("/list.do")) { // 게시판 목록페이지 요청
			
			command = new ListCommand();
			viewPage = command.execute(request, response);
			
		}else if(result.equals("/writeForm.do")) { // 글 작성 폼 요청
			
			viewPage = "board/writeForm.jsp";
			
		}else if(result.equals("/write.do")) { // 글 작성 후 등록요청
			
			command = new WriteCommand();
			viewPage = command.execute(request, response);
			
		}else if(result.equals("/contentView.do")) { // 제목클릭시 해당 내용페이지 요청
			
			command = new ContentViewCommand();
			viewPage = command.execute(request, response);
			
		}else if(result.equals("/modifyForm.do")) { // 수정 폼 요청
			
			viewPage = "board/modifyForm.jsp";
			
		}else if(result.equals("/modify.do")) { // 수정 글 등록요청
			
			command = new ModifyCommand();
			
			viewPage = command.execute(request, response);
			
		}else if(result.equals("/delete.do")) { // 글 삭제요청
			
			command = new DeleteCommand();
			
			viewPage = command.execute(request, response);
			
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		// 서블릿 포워딩 기능의 객체
		
		dispatcher.forward(request, response);
		
		
	}

}






