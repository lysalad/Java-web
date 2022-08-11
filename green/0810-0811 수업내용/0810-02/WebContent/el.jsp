<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><strong>JSP Expression Language</strong></p>
	<p>출력을 도와줍니다</p>
	${ "qwer" }
	${ 123 }
	${ 55.432 }
	${ true }
	<br/>
	${ 1 + 2 }
	${ true && false }
	${ true and false }
	<br/>
	<!-- el에서는 getrequest에서 get을 생략할 수 있다. 
		  모든 객체의 get~블라블라~ 의 get 생략 가능		-->
	${ pageContext.request.requestURI }
</body>
</html>