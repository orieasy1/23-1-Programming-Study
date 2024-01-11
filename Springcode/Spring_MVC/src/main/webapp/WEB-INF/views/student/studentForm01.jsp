<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>학생정보 입력 폼</h2>
	
	<form action="/mvc/student/data1" method="post">
		
		학번 : <input type="number" name="studentID"><br>
		이름 : <input type="text" name="name"><br>
		나이 : <input type="number" name="age"><br>
		
		전공 : <input type="radio" name="major" value="컴퓨터">컴퓨터
		<input type="radio" name="major" value="경영">경영
		<input type="radio" name="major" value="법">법
		<input type="radio" name="major" value="수학">수학
		<br>
		
		동아리 : <input type="checkbox" name="circle" value="밴드">밴드
		<input type="checkbox" name="circle" value="사진">사진
		<input type="checkbox" name="circle" value="영화감상">영화감상
		<input type="checkbox" name="circle" value="축구">축구
		<br>
		
		<input type="submit" value="학생정보 전송">
		
	</form>
	
</body>
</html>