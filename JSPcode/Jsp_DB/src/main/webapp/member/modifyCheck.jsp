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
	
	<%--
		
		3. DAO 객체 생성 후 memberUpdate 메소드 호출하여 결과값 얻기
		4. 결과값이 1이라면 자바스크립트로 회원정보가 수정되었습니다. 출력 후 
		   main.jsp 로 리다이렉트 하기
	 --%>
	
	<%
		request.setCharacterEncoding("UTF-8");
	%>
	
	<jsp:useBean id="dto" class="com.jsp.kgmember.MemberDTO" />
	
	<jsp:setProperty property="*" name="dto"/>
	
	
	<%
	
		MemberDAO dao = MemberDAO.getInstance();
	
		int result = dao.memberUpdate(dto);
		
		if(result == 1){
		
			MemberDTO dto2 = dao.getMember(dto.getId());
			
			session.setAttribute("member", dto2);
			
	%>
		<script>
			alert('회원정보 수정이 되었습니다.');
			window.location = 'main.jsp';
		</script>
	
	<%
			
		}else{
			
	%>
		<script>
			alert('회원정보 수정 실패입니다.');
			history.back();
		</script>
	
	<%
			
		}
	
	%>
	
		
</body>
</html>







