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
	%>
	
	<jsp:useBean id="dto" class="com.jsp.kgmember.MemberDTO" />
	
	<jsp:setProperty property="*" name="dto"/>
	<%--
		property 속성값을 * 로 주면 넘어오는 파라미터 값이 프로퍼티 값으로 셋팅된다.
		주의할 점은 폼으로부터 넘어오는 파라미터의 이름과 프로퍼티 이름이 일치해야 한다는 점이다.
	 --%>
	
	<%
		MemberDAO dao = MemberDAO.getInstance();
	
		boolean idCheck = dao.idCheck(dto.getId());
		
		if(idCheck == true){ // 같은 아이디가 있다면
			
	%>
		<script>
			alert('아이디가 이미 존재합니다.');
			history.back(); // 이전페이지 이동
		</script>
	
	<%
			
		}else{ // 같은 아이디가 없다면
			
			int result = dao.memberInsert(dto);
			
			if(result == 1){
				
	%>
			<script>
				alert('회원가입을 축하합니다.');
				window.location = 'loginForm.jsp';
			</script>
			
	<%
				
			}else{
				
	%>
			<script>
				alert('회원가입 실패입니다.');
				history.back();
			</script>
	
	<%
				
			}
			
		}
		
	
	%>
	
	
</body>
</html>










