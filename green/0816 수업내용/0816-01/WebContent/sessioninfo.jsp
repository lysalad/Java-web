<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 보기</title>
</head>
<body>
	<%--톰캣은 기본 30분 유지시간이 있어서 이 정보가 30분동안 유지된다.
		브라우저를 껐다가 켜면 아이디를 새로 받는다.
		같은 브라우저라고 해도 시크릿 모드로 들어가도 또 새로 준다.--%>
	<p>세션 아이디 : <%= session.getId() %></p>
	<p>세션 생성시간 : <%= new Date(session.getCreationTime()) %></p>
	<p>마지막으로 세션에 접근한 시간 : <%= new Date(session.getLastAccessedTime()) %></p>
</body>
</html>