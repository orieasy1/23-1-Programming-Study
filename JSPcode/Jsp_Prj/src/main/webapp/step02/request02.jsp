<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%!
		String studentID, name, age;
		String[] circle;
	%>
	
	<%--
		1. 스크립트릿으로 넘어온 데이터 request 객체의 get~~ 메소드로 받아
		   해당 변수에 저장하기
		   
		2. 웹브라우저에 학생정보 출력하기
	 --%>
	
	<%
		request.setCharacterEncoding("UTF-8");
		
		studentID = request.getParameter("studentID");
		name = request.getParameter("name");
		age = request.getParameter("age");
		
		circle = request.getParameterValues("circle");
		
	%>
	
	<h2>학생정보 출력</h2>
	
	학번 : <%=studentID %><br>
	이름 : <%=name %><br>
	나이 : <%=age %><br>
	동아리 : <%=Arrays.toString(circle) %><br>
	
		
</body>
</html>




