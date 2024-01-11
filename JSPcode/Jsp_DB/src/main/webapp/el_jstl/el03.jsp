<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%-- 서블릿 보관소에 저장된 데이터를 사용할 수 있다. --%>
	
	<% 
		application.setAttribute("application_name", "application_value");
		session.setAttribute("session_name", "session_value");
		pageContext.setAttribute("page_name", "page_value");
		request.setAttribute("request_name", "request_value");
		
		//session.getAttribute("session_name");
	%>
	
	applicationScope : ${ applicationScope.application_name }<br />
	sessionScope : ${ sessionScope.session_name }<br />
	pageScope : ${ pageScope.page_name }<br />
	requestScope : ${ requestScope.request_name }<br><br>
	
	<hr>
	
	application : ${application_name }<br />
	session : ${session_name }<br />
	page : ${page_name }<br />
	request : ${request_name} <br>
	
</body>
</html>






