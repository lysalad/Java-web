<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 쓰려는 core 라이브러리 이름을 c라고 쓰겟다~ -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>text Jstl</title>
</head>
<body>
	<!-- 반복문을 만들어볼거에요 시작과 끝을 attribute값으로 해줄 수 있어요
		if는 있지만 if else 태그는 없어요 -->
	<c:forEach var="i" begin="1" end="10">
		<c:if test="${ i % 2 == 0 }">
			<p>${ i }</p>
		</c:if>
	</c:forEach>
	
	<hr/>
	
	<!-- if else를 대신할 수 있는 choose -->
	<c:choose>
		<c:when test="false">
			<p>첫번째 조건이 참일 때</p>
		</c:when>
		<c:when test="false">
			<p>두번째 조건이 참일 때</p>
		</c:when>
		<c:otherwise>
			<p>모든 조건이 참이 아닐 때</p>
		</c:otherwise>
	</c:choose>
</body>
</html>