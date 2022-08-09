<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>환영인사</title>
</head>
<body>
	<%
		/* 
	우리가 해야하는건 여러번 검사를 해야한다는 점이다.
	잘못된 접근이다, 잘못된 입력이다 라는 사용자의 가시를 나타내는
	400번대로 응답을 해줘야하나 ???? 
	*/
	String name = request.getParameter("name");
	name = name.trim();

	String ageStr = request.getParameter("age");

	if (ageStr == null || ageStr.trim().length() == 0) {
		response.setStatus(400);
		out.println("잘못된 입력");
	} else {

		int age = Integer.valueOf(ageStr);

		if (name.length() == 0) {
			response.sendRedirect("./person.jsp");
		} else {
			out.print("(" + name + ", " + ageStr + ") 님 환영합니다.");
		}
	}
	%>
</body>
</html>