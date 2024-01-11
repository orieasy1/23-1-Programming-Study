<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		session.setAttribute("sessionName", "sessionValue");
		session.setAttribute("sessionNumber", 12345);
		// setAttribute("세션이름", 값);
		// 이름은 String 타입으로 들어가고 값은 Object 타입이다.
		
	%>
	
	<h2>세션이 생성되었습니다.</h2>
	
	<a href="sessionGet.jsp">세션 얻기</a>
		
</body>
</html>