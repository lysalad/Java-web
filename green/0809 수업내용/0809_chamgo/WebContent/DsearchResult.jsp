<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	div {
		display: flex;
		padding: 0, 0, 0, 100px;
	}
</style>
<title>Insert title here</title>
</head>
<body>
<div>
	나라 인구수
</div>


<%	
	String country = request.getParameter("country");

	

	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
			
	try{
		String Query = "SELECT name, population FROM country WHERE Continent = ? ORDER BY population DESC";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
		pstmt = conn.prepareStatement(Query);
		if(country.equals("1")){
			pstmt.setString(1, "North America");
		} else if(country.endsWith("2")) {
			pstmt.setString(1, "Asia");
		} else if(country.endsWith("3")) {
			pstmt.setString(1, "Africa");
		} else if(country.endsWith("4")) {
			pstmt.setString(1, "Europe");
		} else if(country.endsWith("5")) {
			pstmt.setString(1, "South America");
		} else if(country.endsWith("6")) {
			pstmt.setString(1, "Oceania");
		} else if(country.endsWith("7")) {
			pstmt.setString(1, "Antarctica");
		}
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String name = rs.getString("name");
			String population = rs.getString("population");
			out.println("<li>" + name + "  " + population + "</li>");
		}
		
	} finally {
		if(rs != null) {
			rs.close();
		}
		if(pstmt != null) {
			pstmt.close();
		}
		if(conn != null) {
			conn.close();
		}
	}


%>
</body>
</html>