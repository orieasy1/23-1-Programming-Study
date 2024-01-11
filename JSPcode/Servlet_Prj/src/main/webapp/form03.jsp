<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>나이를 입력해주세요</h2>
	
	<form action="/Servlet_Prj/age" method="get">
		
		나이 입력 : <input type="number" name="age">
		
		<input type="submit" value="나이전송">
		
	</form>
	
</body>
</html>