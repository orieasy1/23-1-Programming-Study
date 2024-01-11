<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 
		회원정보 입력 폼 만들기
		id, pw, name, age, area, hobby [checkbox]
	 -->
	
	<h2>회원정보 입력 폼</h2>
	
	<form action="/Servlet_Prj/member" method="post">
	
		아이디 : <input type="text" name="id" ><br>
		비밀번호 : <input type="password" name="pw" ><br>
		이름 : <input type="text" name="name" ><br>
		나이 : <input type="text" name="age" ><br>
		사는지역 : <input type="text" name="area" ><br>
		
		취미 : <input type="checkbox" name="hobby" value="영화감상">영화감상
		<input type="checkbox" name="hobby" value="낚시">낚시
		<input type="checkbox" name="hobby" value="등산">등산
		<input type="checkbox" name="hobby" value="컴퓨터게임">컴퓨터게임
		
		<input type="submit" value="회원정보 전송">
		
	</form>
	
</body>
</html>