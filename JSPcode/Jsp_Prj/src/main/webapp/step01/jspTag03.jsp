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
		표현식 (expression) : <%= %>
		jsp 페이지 내에서 사용되는 변수의 값 또는 
		메소드 호출 결과값을 출력하기 위해 사용된다.
	 --%>
	
	<%!
		String id = "hong";
		String pw = "1234";
		
		public String hello(){
			return "안녕하세요";
		}
		
	%>
	
	아이디 : <%=id %><br>
	비밀번호 : <%=pw %><br>
	인삿말 : <%=hello() %><br>
	<%--
		표현식은 out.print(); 를 대체한다.
	 --%>
	
</body>
</html>




