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
		// DB와 연결성을 갖는 객체
		Statement stmt;
		// SQL문을 실행하는 객체
		ResultSet rs;
		// 조회결과 데이터를 갖는 객체
		
		String driver = "oracle.jdbc.OracleDriver";
		// Oracle JDBC 드라이버 클래스
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String uid = "C##JSPUSER";
		String upw = "jsp123";
		
		String query = "SELECT * FROM KGMEMBER";
		
	%>
	
	<%
		try{
			
			Class.forName(driver);
			// OracleDriver 클래스를 메모리에 올린다.
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(query);
			// 반환하는 결과 데이터를 ResultSet 객체로 받는다.
			
			while(rs.next()){
				// 다음 레코드가 있는지 판단 후 없으면 false 반환
				// 다음 레코드가 있으면 true를 반환 후 커서를 다음 레코드로 이동
				
				String id = rs.getString("ID");
				// 컬럼의 값을 추출하는 getter 메소드로 
				// 문자열로 컬럼의 이름을 명시하여 해당 값을 얻는다.
				
				String pw = rs.getString("PW");
				String name = rs.getString("NAME");
				String email = rs.getString("EMAIL");
				Timestamp regDate = rs.getTimestamp("REGDATE");
				String address = rs.getString("ADDRESS");
				
				out.print("아이디 : " + id + ", 비밀번호 : " + pw + 
						", 이름 : " + name + ", 이메일 : " + email
						+ ", 가입일 : " + regDate + ", 주소 : " + address + "<br>");
				
			}
			
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}finally{
			
			try{
				
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
				
			}catch(Exception e2){}
			
		}
	
	
	%>
	
	
</body>
</html>





