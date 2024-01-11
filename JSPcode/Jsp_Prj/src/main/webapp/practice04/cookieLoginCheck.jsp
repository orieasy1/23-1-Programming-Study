<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%--
		
		3. 아이디, 또는 비밀번호가 틀리다면
		   cookieLogin.jsp 로 리다이렉트 하기
		  
	 --%>
	
	<%
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("hong") && pw.equals("1234")){
			
			Cookie cookie = new Cookie("id", id);
			cookie.setMaxAge(60 * 60);
			response.addCookie(cookie);
			response.sendRedirect("cookieMain.jsp");
			
		}else{
			
			response.sendRedirect("cookieLogin.jsp");
			
		}
	
	%>
	
	
</body>
</html>








