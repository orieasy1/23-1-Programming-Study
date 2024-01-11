<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	*{
		text-align: center;
		margin: 0 auto;
	}
</style>

</head>
<body>
	
	<br><hr>
	<h2>나의 MVC 게시판</h2>
	<hr><br>
	
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		
		<c:forEach var="dto" items="${list}">
			
			<tr>
				<td>${dto.bId }</td>
				<td>${dto.bWriter }</td>
				<td><a href="/contentView.do?bId=${dto.bId}">${dto.bTitle }</a></td>
				<td> 
					<fmt:formatDate value="${dto.bDate}" pattern="yyyy년 MM월 dd일" />
				</td>
				<td>${dto.bHit }</td>
			</tr>
		
		</c:forEach>
		
		<tr>
			<td colspan="5">
				<a href="/writeForm.do">글 작성하기</a>
			</td>
		</tr>
		
	</table>
	
	
</body>
</html>








