package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/age")
public class Servlet05 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strAge = request.getParameter("age");
		
		int age = Integer.parseInt(strAge);
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>회원의 나이</title>");
		out.print("</head>");
		out.print("<body>");
		
		if(age >= 20) {
			
			out.print("<h2>성인 입니다.</h2>");
			out.print("입력하신 나이 : " + age + "살 입니다.");
			
		}else {
			
			out.print("<h2>미성년자 입니다.</h2>");
			out.print("입력하신 나이 : " + age + "살 입니다.");
			
		}
		
		out.print("</body>");
		out.print("</html>");
		
		out.close();
		
	}

}
