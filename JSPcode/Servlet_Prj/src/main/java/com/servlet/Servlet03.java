package com.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/student")
public class Servlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		// studentID name age major circle
		/*
		String studentID = request.getParameter("studentID");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String major = request.getParameter("major");
		
		String[] circle = request.getParameterValues("circle");
		
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전공 : " + major);
		System.out.println("동아리 : " + Arrays.toString(circle));
		*/
		
		Enumeration<String> e = request.getParameterNames();
		// Enumeration : 컬렉션 프레임워크가 만들어지긴 전 Iterator의 이전버전
		
		while(e.hasMoreElements()) {
			//hasMoreElements : 요소가 남아있다면 true 반환
			//					요소가 남아있지 않다면 false 반환
			
			String name = e.nextElement();
			// nextElement : 다음 요소를 읽어온다.
			
			String[] values = request.getParameterValues(name);
			
			for(String value : values) { // 향상된 for문
				
				System.out.println("이름 : " + name);
				System.out.println("값  : " + value);
				
			}
			System.out.println();
			
		}
		
		
	}

}







