<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<h2>게시글 수정 폼</h2>
	<hr><br>
	
	<form action="/modify.do" method="post" >
	
		<input type="hidden" name="bId" value="${param.bId}">
		
		<table border="1">
			
			<tr>
				<th>게시글번호</th>
				<td>${param.bId }</td>
			</tr>
			
			<tr>
				<th>조회수</th>
				<td>${param.bHit }</td>
			</tr>
			
			<tr>
				<th>작성자</th>
				<td>${param.bWriter }</td>
			</tr>
			
			<tr>
				<th>제목</th>
				<td><input type="text" name="bTitle" value="${param.bTitle}" ></td>
			</tr>
			
			<tr>
				<th>내용</th>
				<td><textarea name="bContent" cols="23" rows="5">${param.bContent}</textarea></td>
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



