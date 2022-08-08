<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
	<p>로그인 처리 요청이 전달되었나요?</p>

	<%
		String id = request.getParameter("userid");
	// 입력값이 있으면 XX님 반갑습니다.
	// 입력값이 없으면...?

	if (id.length() > 0) {
		out.println(id + "님 반갑습니다.");
	} else {
		out.println("입력해주세요.");
	
		//redirect는 사용자에게 요구하는 것
		response.sendRedirect("./login.jsp");
	}
	
	%>

</body>
</html>