<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인적사항 페이지 넘어온거 </title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		out.println(name + "(" + age + ") 님 환영합니다.");
	%>
</body>
</html>