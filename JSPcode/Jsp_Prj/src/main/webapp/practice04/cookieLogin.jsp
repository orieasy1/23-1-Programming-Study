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
		로그인 폼 만들기 (id, pw) 
	 --%>
	
	<h2>로그인 폼</h2>
	
	<form action="cookieLoginCheck.jsp" method="post">
	
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="pw"><br>
		
		<input type="submit" value="로그인">
		
	</form>
	
</body>
</html>



