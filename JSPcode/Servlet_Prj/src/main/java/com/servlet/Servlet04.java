package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member")
public class Servlet04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. request 객체를 사용해서 넘어온 데이터 받아 해당 변수에 저장
		
		request.setCharacterEncoding("UTF-8");
		
		// id pw name age area hobby
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String area = request.getParameter("area");
		
		String[] hobby = request.getParameterValues("hobby");
		
		
		// 2. response 객체를 사용해서 넘어온 회원정보 웹 브라우저에 출력
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>회원정보</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h2>폼에서 넘어온 회원정보 보기</h2>");
		out.print("아이디 : " + id + "<br>");
		out.print("비밀번호 : " + pw + "<br>");
		out.print("이름 : " + name + "<br>");
		out.print("나이 : " + age + "<br>");
		out.print("사는지역 : " + area + "<br>");
		out.print("취미 : " + Arrays.toString(hobby) + "<br>");
		out.print("</body>");
		out.print("</html>");
		
		out.close();
		
	}

}








