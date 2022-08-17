<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 필요 알림</title>
</head>

<%-- http://localhost:8080/0816-02/board 이렇게 보드로 바로 진입하는걸 막아주는 역할을 하는데, web xml에 있음 --%>

<body>
	<p>인증되지 않았습니다.</p>
	<a href="./loginform.jsp"> 로그인하러 가기</a>
</body>
</html>