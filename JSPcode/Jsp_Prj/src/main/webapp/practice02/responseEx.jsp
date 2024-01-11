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
		1. 폼에서 넘어온 데이터 받기
		2. 정답이 "홍길동"과 같다면 OK.jsp 로 리다이렉트 하기
		   정답이 "홍길동"이 아니라면 NG.jsp 로 리다이렉트 하기
	 --%>
	
	<%
		request.setCharacterEncoding("UTF-8");
	
		String answer = request.getParameter("answer");
		
		if(answer.equals("홍길동")){
			response.sendRedirect("OK.jsp");
		}else{
			response.sendRedirect("NG.jsp");
		}
	
	%>
	
</body>
</html>