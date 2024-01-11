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
		선언문으로 이름, 나이, 전화번호 의 변수선언하기
		스크립트릿으로 변수 초기화하기
		표현식으로 웹브라우저에 변수값 출력하기
	 --%>
	
	<%!
		String name;
		int age;
		String tel;
	%>
	
	<%
		name = "홍길동";
		age = 20;
		tel = "010-1111-2222";
	%>
	
	이름 : <%=name %><br>
	나이 : <%=age %><br>
	전화번호 : <%=tel %><br>
	
	
</body>
</html>



