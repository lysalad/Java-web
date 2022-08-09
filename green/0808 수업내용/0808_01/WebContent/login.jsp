<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<%-- 폼에 아무 형식도 넣지 않아서 그냥 GET 형식으로 전송된다. --%>
	<form action="./progress.jsp">
		<input type="text" name="userid" />
		<input type="submit" />
		
		<%-- // 서버가 기억하고 있으면 session
		   //사용자가 기억하고 있으면 cookie
		    이 둘 사이에 논리적인 흐름을 부여해서 서로 기억할 수있도록 한다.
		--%>
		
	</form>
</body>
</html>


