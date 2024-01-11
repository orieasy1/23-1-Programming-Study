<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page errorPage="errorPage.jsp" %>    
    
<%--
	현재 jsp 페이지에서 예외가 발생했을때 사용자에게 보여줄
	예외 화면을 처리할 jsp 페이지의 경로를 지정한다.
 --%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		int i = 10 / 0;
	
	%>
	
</body>
</html>