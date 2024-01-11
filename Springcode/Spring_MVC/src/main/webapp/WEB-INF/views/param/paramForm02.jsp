<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>데이터 입력 폼</h2>
	
	<form action="/mvc/param/data2" method="post">
	
		이름 : <input type="text" name="name"><br>
		나이 : <input type="number" name="age"><br>
		
		<input type="submit" value="데이터 전송">
	
	</form>
	
</body>
</html>