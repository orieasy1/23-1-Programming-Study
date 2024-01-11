<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>티켓 구입하기</h2>
	
	<p>구매장수를 입력 후 구매해 주세요~!!</p>
	
	<form action="/db/movie/ticket/buy" method="post">
		
		<input type="hidden" name="userId" value="${movie.userId}">
		
		<input type="number" name="ticketNumber" min="1" >
		
		<input type="submit" value="티켓구매">
		
	</form>
	
</body>
</html>