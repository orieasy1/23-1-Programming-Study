<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isErrorPage="true" %>    

<%--
	현재 jsp 페이지가 예외처리 페이지라는 것을 명시
	exception 객체를 사용할 수 있다.
 --%>

<%
	response.setStatus(200);
%>    

<%--
	예외처리 페이지가 정상적으로 호출이 되려면 HTTP 상태코드가 정상값인 200이 되야한다.
	response 객체의 setStatus 메소드로 상태값 200을 셋팅한다.
 --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>에러가 발생되었습니다!!!</h2>
	
	<%=exception.getMessage() %>
	
</body>
</html>


