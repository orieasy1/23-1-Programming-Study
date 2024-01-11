<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
		String path = application.getRealPath("/fileFolder");
		// 웹 어플리케이션 내에서의 경로를 매개값으로 넣어주면
		// 시스템상의 절대경로로 바꾸어서 반환해준다.
		
		//System.out.println(path);
		
		int size = 1024 * 1024 * 10; // 10M
		
		String fileName = "";
		String orifileName = "";
		
		try{
			
			MultipartRequest multi = 
					new MultipartRequest(request, 
										path, 
										size, 
										"UTF-8", 
										new DefaultFileRenamePolicy());
			
			// MultipartRequest 객체의 생성자의 인자는 
			// (request, "파일 저장경로", 파일크기(int), "인코딩", 리네임정책)
			// 디폴트 리네임은 정책은 파일이름에 증가하는 숫자를 계속 붙여 나가는 형식
			// new DefaultFileRenamePolicy() 객체를 넣어주면 된다.
			
			Enumeration files = multi.getFileNames();
			
			String str = (String)files.nextElement();
			// form 태그의 <input type="file" name="여기에 지정한 이름"> 을 가져온다.
			
			fileName = multi.getFilesystemName(str);
			// 업로드된 파일의 이름 (리네임 되었을 시 리네임된 이름)
			
			
			orifileName = multi.getOriginalFileName(str);
			// form에서 선택한 원래 파일의 이름
			
			System.out.println("리네임된 파일 이름 : " + fileName);
			System.out.println("원래 파일의 이름 : " + orifileName);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	%>
	
	<h2>파일이 업로드 되었습니다.</h2>
	
	
</body>
</html>