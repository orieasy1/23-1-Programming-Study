<%@page import="com.jsp.kgmember.MemberDTO"%>
<%@page import="com.jsp.kgmember.MemberDAO"%>
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
		request.setCharacterEncoding("UTF-8");
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		
		MemberDAO dao = MemberDAO.getInstance();
		
		int loginCheck = dao.loginCheck(id, pw);
		
		if(loginCheck == -1){
			
		%>
			<script>
				alert('아이디가 틀립니다.');
				history.back();
			</script>
		
		<%
			
		}else if(loginCheck == 0){
			
		%>
			<script>
				alert('비밀번호가 틀립니다.');
				history.back();
			</script>
		
		<%
			
			
		}else if(loginCheck == 1){ // 로그인 OK
			
			MemberDTO dto = dao.getMember(id);
			
			session.setAttribute("member", dto);
		
			response.sendRedirect("main.jsp");
			
		}
		
	%>
	
</body>
</html>







