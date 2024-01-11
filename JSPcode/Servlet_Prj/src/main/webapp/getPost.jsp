<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Get 방식</h2>
	
	<form action="/Servlet_Prj/getPost" method="get" >
		
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="pw"><br>
		
		<input type="submit" value="GET">
		
	</form>
	
	
	<hr>
	
	<h2>Post 방식</h2>
	
	<form action="/Servlet_Prj/getPost" method="post">
		
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="pw"><br>
		
		<input type="submit" value="post">
	
	</form>
	
	
	
</body>
</html>