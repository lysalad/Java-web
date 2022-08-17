<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	<%-- 숨기기 위해서 일부러 INF에 넣었따. 직접 요청으로 이페이지를 볼 수 없다. --%>
	<c:if test="${ not empty articles }">
		<c:forEach var="a" items="${ articles }">
			<p>${ a }</p>
		</c:forEach>
	</c:if>
</body>
</html>