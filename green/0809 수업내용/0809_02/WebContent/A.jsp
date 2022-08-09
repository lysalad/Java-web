
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.time.LocalTime" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> A</h1>
<% request.getAttribute("time"); %>
<%--
	<%
		out.println("현재 시간을 보여드리겠읍니다.");
	%>

	<p>쨔잔</p>
	<strong> <%=LocalTime.now()%></strong>
	
	 --%>
</body>
</html>