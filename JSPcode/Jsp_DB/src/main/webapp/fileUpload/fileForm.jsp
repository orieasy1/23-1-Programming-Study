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
		파일을 업로드 할때 <form> 태그에서 enctype 속성을
		multipart/form-data 로 지정을 해야 한다.
		모든 문자를 인코딩하지 않음을 명시한다.
		파일이나 이미지를 서버로 전송할때 사용한다.
	 --%>
	
	<form action="fileCheck.jsp" method="post" enctype="multipart/form-data">
	
		파일 선택 : <input type="file" name="file"><br><br>
		
		 <input type="submit" value="파일 업로드!">
	
	</form>
	
	
	
</body>
</html>