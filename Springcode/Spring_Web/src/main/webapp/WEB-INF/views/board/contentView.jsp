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
	<h2><a href="/board/list?page=${param.page}&searchWord=${param.searchWord}&key=${param.key}">게시판 목록</a></h2>
	<hr><br>
	<h2>${content.title } 내용보기</h2>
	<br><hr><br>
	
	<table border="1">
		<tr>
			<th>글번호</th>
			<td>${content.id }</td>
		</tr>
		
		<tr>
			<th>조회수</th>
			<td>${content.viewCount }</td>
		</tr>
		
		<tr>
			<th>작성자</th>
			<td>${content.writer }</td>
		</tr>
		
		<tr>
			<th>제목</th>
			<td>${content.title }</td>
		</tr>
		
		<tr>
			<th>내용</th>
			<td>${content.content }</td>
		</tr>
		
		<tr>
			<td colspan="2">
				<form name="modifyForm" action="/board/modifyForm" method="post">
					
					<input type="hidden" name="id" value="${content.id}">
					<input type="hidden" name="viewCount" value="${content.viewCount}">
					<input type="hidden" name="writer" value="${content.writer}">
					<input type="hidden" name="title" value="${content.title}">
					<input type="hidden" name="content" value="${content.content}">
					
					<input type="submit" value="수정">
					
					&nbsp;&nbsp;&nbsp;
					
					<input type="button" onclick="deleteCheck()" value="삭제">
					
				</form>
			</td>
		</tr>
		
	</table>
	
	
	<script type="text/javascript">
	
		function deleteCheck(){
			
			var result = confirm('정말 삭제를 하시겠습니까??');
			
			if(result){
				
				var modifyForm = document.modifyForm;
				modifyForm.action = '/db/board/delete';
				modifyForm.submit();
				
			}else{
				return;
			}
			
		}
	
	</script>
	
	
</body>
</html>






