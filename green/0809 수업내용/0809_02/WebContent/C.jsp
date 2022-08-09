<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> C</h1>
	<% request.getAttribute("random"); %>
	
	<%-- 
	<%
		out.println("랜덤 숫자가 하나 나옵니당");
		out.println("숫자가 50보다 크면 행운이~");
		
		Random r = new Random();
		int random = r.nextInt(100) + 1;
		
		out.println(random + "나왔읍디다!");
	%>
	--%>

</body>
</html>