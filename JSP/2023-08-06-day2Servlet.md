<h1>서블릿</h1>

```java
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//어노테이션이란 메타 데이터라고 볼 수 있다.
//프로그램 실행 관점에서 보면 프로그램이 처리할 메인데이터가 아니라 실행과정에ㅓ 데이터를 어떻게 처리하 것인지 알려주는 서브데이터이다.
/**
 * Servlet implementation class Servlet01
 */
@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     //직렬화 키
	 //자바에서 직렬화란?
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request: 클라잉ㄴ트로부터의 요청처리 객체
		//예: 로그인시 클라이언트의 아이디와 비밀번호는 request객체에 담겨져 온다.                                                                                                        
		
		//response: 클라이언트로의 응답처리 객체
		//예: 로그인 시 회원인지 아닌지 정보를 ㅋㄹ라이언트한테 보낸다
		
		response.setCharacterEncoding("UTF-8");
		//해당하는 문서를 UTF-8로 인코딩을 하여 웹브라우저에게 보낸다.
		
		response.setContentType("text/html; charset = UTF-8");
		//웹브라우저에게 html문서를 UTF-8로 해석하라는 뜻
		
		PrintWriter out = response.getWriter();
		//웹브라우저에게 출력하기 위한 출력스트림 열기
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("서블릿 시작합니다");
		out.println("</h2>");
		out.println("</body>");
		out.println("</html");
		
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
```
