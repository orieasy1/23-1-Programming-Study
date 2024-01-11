<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>${movie.userName }님 안녕하세요~!!!</h2>
	
	<h2>현재 포인트 잔액 : ${movie.point }</h2>
	
	<h2>현재 티켓 구입 수 : ${ticketNumber}</h2>
	
	
	<a href="/db/movie/ticket/buy">영화티켓 구입하기</a>
	
	&nbsp;&nbsp;&nbsp;
	
	<a href="/db/movie/logout">로그아웃</a>
	
</body>
</html>





