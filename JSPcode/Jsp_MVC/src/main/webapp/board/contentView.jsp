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
	
	form{
		display: inline;
	}
	
</style>

</head>
<body>
	
	<br><hr>
	<h2><a href="/list.do">게시판으로 이동</a></h2>
	<hr><br>
	
	<h2>${content.bTitle } 의 내용</h2>
	<br>
	
	<table border="1">
		<tr>
			<th>글번호</th>
			<td>${content.bId }</td>
		</tr>
		
		<tr>
			<th>조회수</th>
			<td>${content.bHit }</td>
		</tr>
		
		<tr>
			<th>작성자</th>
			<td>${content.bWriter }</td>
		</tr>
		
		<tr>
			<th>제목</th>
			<td>${content.bTitle }</td>
		</tr>
		
		<tr>
			<th>내용</th>
			<td>${content.bContent }</td>
		</tr>
		
		<tr>
			<td colspan="2">
			
				<form action="/modifyForm.do" method="post">
					
					<input type="hidden" name="bId" value="${content.bId}">
					<input type="hidden" name="bHit" value="${content.bHit}">
					<input type="hidden" name="bWriter" value="${content.bWriter}">
					<input type="hidden" name="bTitle" value="${content.bTitle}">
					<input type="hidden" name="bContent" value="${content.bContent}">
					
					<input type="submit" value="글수정">
					
				</form>
			
				&nbsp;&nbsp;&nbsp;
				
				<form action="/delete.do" method="post">
					
					<input type="hidden" name="bId" value="${content.bId}">
					
					<input type="submit" value="글삭제">
					
				</form>
				
			</td>
		</tr>
		
	</table>
	
</body>
</html>




