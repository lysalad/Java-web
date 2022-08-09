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
	<h1>B</h1>
	<% request.getAttribute("date"); %>
	
	<%-- 
	<%
		out.println("현재 날짜를 보여드리겠읍니다.");
	%>

	<p>쨔잔</p>
	<strong> <%=LocalDate.now()%></strong>
	--%>
</body>
	


</body>
</html>