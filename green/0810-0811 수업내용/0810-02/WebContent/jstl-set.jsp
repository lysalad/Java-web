<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Jstl - set</title>
</head>
<body>
	<% request.setAttribute("asdf", "zxcv"); %>
	<c:set var="jjj" value="value2" scope="request"/>
	${ asdf }
	${ jjj }
	<hr />
	
	<!-- 주소 값을 만들어서 설정을 해주는 태그가 있어요 -->
	<c:url var="searchGoogle" value="http://google.com/search" >
		<c:param name="q" value="검색파라미터" />
	</c:url>
	
	<c:out value="출력할때 쓰는데"/>
	
	<a href="${ searchGoogle }">구글 검색</a>
</body>
</html>