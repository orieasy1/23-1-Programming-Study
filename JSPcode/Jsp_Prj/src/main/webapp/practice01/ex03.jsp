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
		Math.random() 와 선언문을 사용하여
		주사위 번호 하나를 얻는 메소드 만들기
		
		웹브라우저에 주사위 번호를 얻어서 출력하기 
	 --%>
	
	<%!
		public int getDice(){
			
			int dice = (int)(Math.random() * 6) + 1;
			// 0.0부터 1.0미만의 double 타입 수 하나를 준다.
			return dice;
		}
	
	%>
	
	<h2>오늘의 주사위 번호 : <%=getDice() %></h2>
	
</body>
</html>








