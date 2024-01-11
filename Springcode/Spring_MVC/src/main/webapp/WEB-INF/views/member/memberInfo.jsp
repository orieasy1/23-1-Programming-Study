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
	
	<br><hr>
	
	<h2><a href="/mvc/member/list">회원 리스트 보기</a></h2>
	
	<hr><br>
	
	<h2>${info.name } 회원님의 정보보기</h2>
	
	<table border="1">
		
		<tr>
			<th>아이디</th>
			<td>${info.id }</td>
		</tr>
		
		<tr>
			<th>이름</th>
			<td>${info.name}</td>
		</tr>
		
		<tr>
			<th>전화번호</th>
			<td>${info.tel }</td>
		</tr>
		
		<tr>
			<th>이메일</th>
			<td>${info.email }</td>
		</tr>
		
		<tr>
			<th>주소</th>
			<td>${info.address }</td>
		</tr>
		
		<tr>
			<th>가입일</th>
			<td>${info.regDate}</td>
		</tr>
		
		<tr>
			<td colspan="2">
				
				<form name="modifyForm" action="/mvc/member/modify" method="get">
					<input type="hidden" name="id" value="${info.id }">
					<input type="submit" value="회원정보 수정">
					
					&nbsp;&nbsp;
					
					<input type="button" name="delete" onclick="deleteCheck()" value="회원탈퇴" >
					
				</form>
				
			</td>
		</tr>
		
	</table>
	
	
	<script>
		
		function deleteCheck(){
			
			var check = confirm('정말 회원 탈퇴를 하시겠습니까??');
			
			if(check){
				
				var modifyForm = document.modifyForm;
				modifyForm.method = "post";
				modifyForm.action = "/mvc/member/delete";
				modifyForm.submit();
				
			}else{
				return;
			}
			
		}
	
	</script>
	
	
</body>
</html>






