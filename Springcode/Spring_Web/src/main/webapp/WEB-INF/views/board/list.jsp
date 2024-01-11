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
	
	<c:if test="${msg != null}">
		<script>
			alert('${msg}');
		</script>
	</c:if>
	
	<br><hr>
	<h2><a href="/board/list">나의 MVC SPRING 게시판</a></h2>
	<hr><br>
	
	<form action="/board/list" method="get">
	
		<select name="searchWord">
			
			<option value="writer">작성자</option>
			<option value="title">제목</option>
			<option value="content">내용</option>
			<option value="titleAndContent">제목 + 내용</option>
		
		</select>
		
		<input type="text" name="key" placeholder="검색어를 입력해주세요">
		
		<input type="submit" value="검색">
		
	</form>
	
	<br>
	
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
				<td>${dto.id}</td>
				<td>${dto.writer}</td>
				<td>
					<a href="/board/contentView?id=${dto.id}&page=${paging.currentPage}&searchWord=${param.searchWord}&key=${param.key}">${dto.title }</a>
				</td>
				<td>
					<fmt:formatDate value="${dto.regDate }" pattern="yyyy-MM-dd" />
				</td>
				<td>${dto.viewCount }</td>
			</tr>
			
		</c:forEach>
		
		<tr>
			<td colspan="5">
				<a href="/board/write">글 작성</a>
			</td>
		</tr>
		
	</table>
	
	<c:if test="${paging.prev}">
		<a href="/board/list?page=${paging.startPage-1 }&searchWord=${param.searchWord}&key=${param.key}">[이전]</a>
	</c:if>
	
	<c:forEach var="pageNum" begin="${paging.startPage }" end="${paging.endPage }" >
		<a href="/board/list?page=${pageNum }&searchWord=${param.searchWord}&key=${param.key}"
		style="${pageNum == paging.currentPage ? 'color:red' : 'color:blue'}">
			${pageNum }
		</a>
	</c:forEach>
	
	<c:if test="${paging.next}">
		<a href="/board/list?page=${paging.endPage+1 }&searchWord=${param.searchWord}&key=${param.key}">[다음]</a>
	</c:if>
	
</body>
</html>




