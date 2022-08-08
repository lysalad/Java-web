<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과일이냐 사람이냐 뭘 보고싶은가</title>
</head>
<body>
	
	<%= request.getParameter("progress") %>
	<form action="./switchpath.jsp">
		<%--라디오버튼에는 이름을 똑같이 줘야한다. --%>
		<input type="radio" name="choice" value="person" /> 사람
		<input type="radio" name="choice" value="fruit" /> 과일
		<input type="submit" />
			
	</form>
</body>
</html>