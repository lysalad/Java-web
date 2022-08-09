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
<title>Insert title here</title>
</head>
<body>
<%-- 사용자가 대륙을 선택할 수 있게 --%>
<%-- 선택한 대륙의 국가들의 이름, 인구를 볼수있는 (인구 내림차순) 페이지 --%>
	<form action="DsearchResult.jsp">
		<select name="country">
			<option value="1">North America</option>
			<option value="2">Asia</option>
			<option value="3">Africa</option>
			<option value="4">Europe</option>
			<option value="5">South America</option>
			<option value="6">Oceania</option>
			<option value="7">Antarctica</option>
		</select>
		<input type="submit"/>
	</form>




</body>
</html>