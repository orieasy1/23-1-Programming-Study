package com.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet08")
public class Servlet08 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext application = super.getServletContext();
		// getServletContext 메소드 호출 시 ServletContext 객체 반환
		// 컨텍스트(웹 어플리케이션) 마다 하나의 ServletContext 가 생성된다.
		// 서블릿끼리 자원(데이터)를 공유하는데 사용된다.
		
		String name = application.getInitParameter("name");
		
		String age = application.getInitParameter("age");
		
		System.out.println("공유 이름 : " + name);
		System.out.println("공유 나이 : " + age);
		
		
		
	}

}





