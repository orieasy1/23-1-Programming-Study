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
		String sessionNameValue = (String)session.getAttribute("sessionName");
		// getAttribute 메소드의 반환타입은 Object 타입이다.
		
		int sessionNumberValue = (int)session.getAttribute("sessionNumber");
		
		out.print("sessionName 값 : " + sessionNameValue + "<br>");
		out.print("sessionNumber 값 : " + sessionNumberValue + "<br>");
		
		out.print("<hr>");
		
		String sessionID = session.getId();
		// 한브라우저당 고유한 아이디가 생성이 된다.
		// 웹브라우저별로 생성되어진 세션을 구분할 수 있다.
		
		out.print("세션 아이디 : " + sessionID + "<br>");
		
		int sessionInter = session.getMaxInactiveInterval();
		// 세션 유효시간 (기본 30분)
		
		out.print("세션 유효시간 : " + sessionInter + "<br>");
		
		out.print("<hr>");
		
		session.removeAttribute("sessionName");
		// 해당 세션의 Entry 삭제
		
		session.invalidate();
		// 세션의 모든 데이터를 삭제한다.
		
		if(request.isRequestedSessionIdValid()){
			// 유효한 세션이 있으면 true 반환
			// 유요한 세션이 없으면 false 반환
			out.print("유효한 세션이 있음");
			
		}else{
			out.print("유효한 세션이 없음");
		}
		
		
	%>
	
</body>
</html>




