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
	* {
		text-align: center;
		margin: 0 auto;
	}
</style>

</head>
<body>
	
	<c:if test="${msg != null }">
		<script>
			alert('${msg}');
		</script>
	</c:if>
	
	<br><hr>
	<h2>회원 전체 목록</h2>
	<hr><br>
	
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>이메일</th>
			<th>주소</th>
			<th>회원가입일</th>
		</tr>
		
		<c:forEach var="member" items="${memberList}">
		
			<tr>
				<td>${member.id }</td>
				<td>
					<a href="/mvc/member/info?id=${member.id}">${member.name}</a>
				</td>
				<td>${member.tel }</td>
				<td>${member.email }</td>
				<td>${member.address }</td>
				<td>
					<fmt:formatDate value="${member.regDate }" 
					pattern="yyyy년 MM월 dd일" />
				</td>
			</tr>
		
		</c:forEach>
		
	</table>
	
	<h3><a href="/mvc/member/join">회원 가입하기</a></h3>
	
</body>
</html>















