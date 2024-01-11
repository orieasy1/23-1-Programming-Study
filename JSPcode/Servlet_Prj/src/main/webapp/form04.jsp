<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>2 ~ 9 숫자 중 하나를 입력해주세요</h2>
	
	<form action="/Servlet_Prj/dan" method="get">
	
		숫자 입력 : <input type="number" name="dan">
		
		<input type="submit" value="숫자 전송">
		
	</form>
	
</body>
</html>