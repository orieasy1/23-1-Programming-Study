package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dan")
public class Servlet06 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String str = request.getParameter("dan");
		
		int dan = 0;
		
		if(str == null || str.equals("")) {
			
			dan = 1;
			
		}else {
			dan = Integer.parseInt(str);
		}
		
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>구구단</title>");
		out.print("</head>");
		out.print("<body>");
		
		if(dan < 2 || dan > 9) {
			out.print("<h2>숫자 2부터 9까지 입력을 해주세요~!!</h2>");
		}else {
			
			out.print("<h2>" + dan + "단 출력</h2>");
			
			for(int i = 1; i <= 9; i++) {
				
				out.print("<p>" + dan + "X" + i + "=" + (dan*i) + "</p>");
				
			}
			
		}
		
		
		out.print("</body>");
		out.print("</html>");
		
		
		out.close();
		
		
	}

}
