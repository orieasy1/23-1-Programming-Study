<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	* {
		text-align: center;
		margin: 0 auto;
	}
</style>

</head>
<body>
		
	<br><hr>
	<h2>회원정보 수정 폼</h2>
	<hr><br>
	
	<form action="/mvc/member/modify" method="post">
		
		<input type="hidden" name="id" value="${modify.id}">
		
		<table border="1">
			
			<tr>
				<th>아이디</th>
				<td>${modify.id }</td>
			</tr> 
			
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" name="pw" value="${modify.pw }" >
				</td>
			</tr>
			
			<tr>
				<th>이름</th>
				<td>${modify.name }</td>
			</tr>
			
			<tr>
				<th>전화번호</th>
				<td>
					<input type="text" name="tel" value="${modify.tel }">
				</td>
			</tr>
			
			<tr>
				<th>이메일</th>
				<td>
					<input type="text" name="email" value="${modify.email }">
				</td>
			</tr>
			
			<tr>
				<th>주소</th>
				<td>
					<input type="text" name="address" value="${modify.address }">
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" value="회원정보 수정">
				</td>
			</tr>
			
		</table>
	
	</form>
	
</body>
</html>










