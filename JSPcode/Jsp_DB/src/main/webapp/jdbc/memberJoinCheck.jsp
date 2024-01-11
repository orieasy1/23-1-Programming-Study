<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%!
		Connection conn;
		Statement stmt;
		PreparedStatement pstmt;
		// Statement 를 상속받은 인터페이스
		// Statement 기능향상
		
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "C##JSPUSER";
		String upw = "jsp123";
		
	%>
	
	<%
		request.setCharacterEncoding("UTF-8");
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
// 		String query = "INSERT INTO KGMEMBER(ID, PW, NAME, EMAIL, ADDRESS)" + 
// 						" VALUES('" + id + "', '" + pw + "', '" +
// 								name + "', '" + email + "', '" 
// 								+ address + "')";
		
		String query = "INSERT INTO KGMEMBER(ID, PW, NAME, EMAIL, ADDRESS)" + 
						" VALUES(?, ?, ?, ?, ?)";

		try{
			
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, uid, upw);
			
// 			stmt = conn.createStatement();
// 			int i = stmt.executeUpdate(query);
// 			// executeUpdate 메소드는 변경된 레코드의 수를 반환
// 			if(i == 1){
// 				response.sendRedirect("memberList.jsp");
// 			}
			
			pstmt = conn.prepareStatement(query);
			// SQL 문은 변경 X : 보안상 유리
			
			pstmt.setString(1, id);
			// ? 의 index는 1부터 시작한다.
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.setString(5, address);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1){
				response.sendRedirect("memberList.jsp");
			}
			
			
		}catch(Exception e){
			e.printStackTrace();	
		}finally{
			
			try{
				
				//if(stmt != null)stmt.close();
				if(conn != null)conn.close();
				
			}catch(Exception e2){}
			
		}
		
		
	%>
	
</body>
</html>





