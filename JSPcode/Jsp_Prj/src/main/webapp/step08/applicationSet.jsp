<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%--
		application 객체는 jsp 기본 내장객체로 
		jsp 페이지에서 따로 선언하지 않아도 사용할 수 있다.
	 --%>
	
	<%
		application.setAttribute("name", "홍길동");
		application.setAttribute("age", 20);
	%>
	
	<h2>어플리케이션이 생성되었습니다.</h2>
	
	<a href="applicationGet.jsp">어플리케이션 얻기</a>
	
</body>
</html>





