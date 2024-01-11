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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("sung") && pw.equals("5678")){
			
			session.setAttribute("id", id);
			response.sendRedirect("sessionMain.jsp");
			
		}else{
			response.sendRedirect("sessionLogin.jsp");
		}
	
	%>
	
</body>
</html>