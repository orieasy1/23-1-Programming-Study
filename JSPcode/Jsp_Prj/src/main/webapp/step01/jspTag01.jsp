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
		스크립트릿(scriptlet) : <% %>
		이 안에는 자바에서 쓰는 모든것을 
		사용할 수 있는 자바의 영역이다.
		자바의 기능을 가지고 여러가지 작업을 할 수 있다.
	 --%>
	
	<%
		for(int i = 0; i <= 10; i++){
			
			if(i % 2 == 1){
				
				out.print("<b>" + i + "</b>&nbsp;");
				// out : jsp 페이지의 결과를 출력할때 사용되는 출력스트림
			}
			
		}
		
	%>
	
	<%
		for(int i = 0; i < 5; i++){
	%>
		<p>안녕하세요!!</p>
		
	<%
		}
	%>
	
	
</body>
</html>

















