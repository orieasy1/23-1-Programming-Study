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
	EL(Expression Language)은
	정수, 실수, Boolean, 문자열, null 을 표현할 수 있다.
	 --%>
	
	정수 : ${100}<br>
	실수 : ${3.14}<br>
	논리 : ${true}<br>
	문자열 : ${"ABC"}<br>
	널 : ${null}<br>	
	
	<%--
		EL에서 사용하는 연산자는 산술 연산자, 
		관계(비교) 연산자, 논리 연산자, 조건(삼항) 연산자가 있다.
	 --%>
	<p>EL 산술연산자</p>
	${ 1+2 } <br />
	${ 1-2 } <br />
	${ 1*2 } <br />
	${ 1/2 } <br />
	
	<p>관계(비교) 연산자</p>
	${ 1<2 } <br />
	${ 1>2 } <br />
	${ 1==1 } <br />
	${ 1!=1 } <br />
	
	<p>논리 연산자</p>	
	${ (1>2) || (1<2) } <br />
	${ (1>2) && (1<2) } <br />
	
	<p>조건(삼항) 연산자</p>
	${ (1>2) ? 1 : 2 } <br />
	
</body>
</html>



