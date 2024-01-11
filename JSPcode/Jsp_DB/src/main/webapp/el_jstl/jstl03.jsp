<%@page import="java.util.ArrayList"%>
<%@page import="com.jsp.el.Member"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
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
		com.jsp.el.Member 타입의 ArrayList 객체생성 후
		3개의 Member 객체를 생성 후 ArrayList 객체에 저장하기
		request 객체에 ArrayList 객체 바인딩 후 
		jstl의 forEach 태그로 ArrayList 안에 Member 속성 출력하기
	 --%>
	
	<%
		List<Member> list = new ArrayList<>();
		
		list.add(new Member("hong", "1234", "홍길동", 20));
		list.add(new Member("mong", "1111", "이몽룡", 23));
		list.add(new Member("jang", "2222", "장보고", 25));
		
		request.setAttribute("members", list);
		
	%>
	
	<c:forEach var="member" items="${members}">
		
		아이디 : ${member.id }, 비밀번호 : ${member.pw }, 
		이름 : ${member.name }, 나이 : ${member.age }<br>
		
	</c:forEach>
	
	
</body>
</html>