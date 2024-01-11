<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	*{
		text-align: center;
		margin: 0 auto;
	}
</style>

</head>
<body>
	
	<%--
		EL param 내장객체를 사용하여 수정 폼 만들기
		제목 title 내용 content
	 --%>
	
	<br><hr>
	<h2>${param.title } 글수정 폼</h2>
	<hr><br>
	
	<form action="/db/board/modify" method="post">
		
		<input type="hidden" name="id" value="${param.id }">
		
		<table border="1">
			<tr>
				<th>글번호</th>
				<td>${param.id }</td>
			</tr>
			
			<tr>
				<th>조회수</th>
				<td>${param.viewCount }</td>
			</tr>
			
			<tr>
				<th>작성자</th>
				<td>${param.writer }</td>
			</tr>
			
			<tr>
				<th>제목</th>
				<td>
					<input type="text" name="title" value="${param.title}">
				</td>
				
			</tr>
			
			<tr>
				<th>내용</th>
				<td>
					<textarea name="content" rows="5" cols="23">${param.content}</textarea>
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" value="글수정">
				</td>
			</tr>
			
		</table>
	
	</form>
	
	
	
</body>
</html>