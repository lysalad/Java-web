<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자가 볼 페이지</title>
</head>
<body>
	<p>정보</p>
	<p>연산의 결과</p>
	<%-- Dispatcher는 foward를 할수 있도록 하는 객체
	forward라는 기능을 가진 객체
	forward는 흐름을 이어주는 기능
	원래는 WEB-INF 안에 있으면 못보는데
	볼 수 있게 됐따 ...? --%>
	<%-- <%= request.getParameter("result") %> --%>
	<%= request.getAttribute("result") %>
</body>
</html>