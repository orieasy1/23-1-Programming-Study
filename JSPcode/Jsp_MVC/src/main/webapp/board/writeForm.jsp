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
	<h2>게시글 작성 폼</h2>
	<hr><br>
	
	<form action="/write.do" method="post" >
		
		<table border="1">
			<tr>
				<th>작성자</th>
				<td><input type="text" name="bWriter"></td>
			</tr>
			
			<tr>
				<th>제목</th>
				<td><input type="text" name="bTitle"></td>
			</tr>
			
			<tr>
				<th>내용</th>
				<td><textarea name="bContent" cols="23" rows="5"></textarea></td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" value="글등록">
				</td>
			</tr>
			
		</table>
	
	
	</form>
	
	
</body>
</html>



