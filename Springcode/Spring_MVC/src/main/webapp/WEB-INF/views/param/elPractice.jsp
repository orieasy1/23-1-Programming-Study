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
		EL(Expression Language) 는
		정수, 실수, 논리, 문자열, null을 표현할 수 있다.
	 --%>
	
	정수 : ${100 }<br>
	실수 : ${3.14 }<br>
	논리 : ${true }<br>
	문자열 : ${"Hello World" }<br>
	널 : ${null }<br>
	
	<hr>
	
	<form action="/mvc/param/el" method="post">
		
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="pw"><br>
		
		<input type="submit" value="로그인">
	
	</form>
	
	<%--
		EL 내장객체 param 객체로, 넘어온 파라미터 값을 사용할 수 있다.
	 --%>
	
	아이디 : ${param.id }<br>
	비밀번호 : ${param.pw }<br>
	
	<hr>
	
	<%--
		서블릿 보관소에 저장된 데이터를 사용할 수 있다.
	 --%>
	
	<%
		application.setAttribute("appliName", "appliValue");
		session.setAttribute("sessionName", "sessionValue");
		request.setAttribute("requestName", "requestValue");
		pageContext.setAttribute("pageName", "pageValue");
	%>
	
	어플리케이션 : ${applicationScope.appliName }<br>
	세션 : ${sessionScope.sessionName }<br>
	리퀘스트 : ${requestScope.requestName }<br>
	페이지 : ${pageScope.pageName }<br>
	
	<hr>
	
	어플리케이션 : ${appliName }<br>
	세션 : ${sessionName }<br>
	리퀘스트 : ${requestName }<br>
	페이지 : ${pageName }<br>	
	
	
	
</body>
</html>




