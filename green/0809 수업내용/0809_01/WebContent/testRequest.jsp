<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>contextPath</title>
</head>
<body>
	<p> 자바 웹 어플리케이션은 각각의 고유한 context root 경로를 가집니다</p>
	<p> <%= request.getContextPath() %> </p>
	
	<%-- 절대경로나 상대경로 말고 이렇게도 쓸 수 있다. --%>
	<form action="<%= request.getContextPath() %>/testRequest.jsp">
		<input type="submit" />
	
	</form>
</body>
</html>