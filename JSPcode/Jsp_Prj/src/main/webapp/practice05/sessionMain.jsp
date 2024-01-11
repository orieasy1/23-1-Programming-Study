<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		String id = (String)session.getAttribute("id");
	
		if(id != null){
			
			if(id.equals("sung")){
				out.print("<h2>성춘향님 안녕하세요!!!</h2>");
			}
			
		}
	
	%>
	
	<a href="sessionLogout.jsp">로그아웃</a>
	
</body>
</html>