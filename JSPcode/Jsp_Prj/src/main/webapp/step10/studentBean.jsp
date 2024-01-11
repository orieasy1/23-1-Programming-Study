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
		id : jsp 페이지에서 자바빈 객체의 이름을 명시
		class : 패키지명을 포함한 자바빈 클래스의 완전한 이름을 명시
		scope : 자바빈 객체가 저장될 영역을 명시
		(page, request, session, application)
	 --%>
			
	<jsp:useBean id="student" class="com.student.Student" scope="page" />
	
	<jsp:setProperty name="student" property="studentID" value="202301" />
	<jsp:setProperty name="student" property="name" value="홍길동" />
	<jsp:setProperty name="student" property="age" value="20" />
	<jsp:setProperty name="student" property="grade" value="1" />
	
	학번 : <jsp:getProperty name="student" property="studentID" /><br>
	이름 : <jsp:getProperty name="student" property="name" /><br>
	나이 : <jsp:getProperty name="student" property="age" /><br>
	학년 : <jsp:getProperty name="student" property="grade" /><br>
	
	
	
</body>
</html>








