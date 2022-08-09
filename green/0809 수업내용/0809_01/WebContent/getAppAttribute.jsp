<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- add~어쩌고 파일을 실행하고 얘를 실행하면 값이 설정되어있음
	근데 껐다가 다시 켜면 날아감 --%>
	<p> 어플리케이션 기본 객체에 설정이 되어 있는 값을 확인하는 페이지 </p>
	<%= application.getAttribute("myStr") %>
	<%= application.getAttribute("myInt") %>
	
	<%-- 정보의 영역(scope)가 중요한데, 얘는 app이 존재하는 동안 계속 존재한다.
	app이 없으면 존재 안함 --%>
</body>
</html>