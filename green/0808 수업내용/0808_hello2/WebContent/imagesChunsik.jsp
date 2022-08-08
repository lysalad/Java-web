<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
		List<String> list = new ArrayList<>();
		String[] number = request.getParameterValues("num");
		
		for(int i = 0; i < number.length;i++){
			list.add(number[i]);
		}
		
		if(list.contains("1")){
			out.println("<img src=\"./images/chunsik/춘식1.png\" / >");
		}
		if(list.contains("2")){
			out.println("<img src=\"./images/chunsik/춘식2.png\" / >");
		}
		if(list.contains("3")){
			out.println("<img src=\"./images/chunsik/춘식3.png\" / >");
		}
		
	%>
</body>
</html>