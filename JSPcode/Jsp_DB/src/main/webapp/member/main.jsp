<%@page import="com.jsp.kgmember.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	if(session.getAttribute("member") == null){
    %>
    	<jsp:forward page="loginForm.jsp" />
    <%
    	}
    
    	MemberDTO dto = (MemberDTO)session.getAttribute("member");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2><%=dto.getName() %>님 안녕하세요!!!</h2>
	
	<h2><%=dto.getName() %>님의 아이디 : <%=dto.getId()%></h2>
	
	<h2><%=dto.getName() %>님의 이메일 : <%=dto.getEmail()%></h2>
	<h2><%=dto.getName() %>님의 주소 : <%=dto.getAddress()%></h2>
	
	<a href="logout.jsp">로그아웃</a>
	
	&nbsp;&nbsp;&nbsp;
	
	<a href="modifyForm.jsp">회원정보 수정</a>
	
	&nbsp;&nbsp;&nbsp;
	
	<a href="delete.jsp">회원 탈퇴</a>
	
	
	
	
</body>
</html>





