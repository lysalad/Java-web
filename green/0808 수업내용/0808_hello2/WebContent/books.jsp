<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%
	List<String> list = new ArrayList<>();
	for (int i = 0; i < 100; i++) {
		list.add("book" + i);
	}
%>

<!-- 
	사용자가 1 입력 시 book0 ~ book9
	사용자가 2 입력 시 book10 ~ book19 
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 페이지</title>
</head>
<body>

	<%
		String pageStr = request.getParameter("page");
		int pageNum = Integer.parseInt(pageStr);
		
		int start = (pageNum - 1) * 10;
		
		for (int i = start; i < start + 10; i++) {
			out.println(list.get(i));
			out.println("<br/>");
		}
	%>
	
</body>
</html>