<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.time.LocalDate" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		System.out.println("오늘 날짜를 보여드리겠웁니다");
		
	%>
	
	<p> 쨔잔 </p>
	<strong> <%= LocalDate.now() %></strong>
</body>
</html>