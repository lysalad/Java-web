<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>context가 뭘까용?</title>
</head>
<body>
	<p> context가 뭔가요? </p>
	
	<%
		// page context라는 객체
		// context는 개발자들이 사용할 수 있는, 어플리케이션 개발에 필요한 정보들을 모아두는 공간이다.
		// 
		ServletRequest req = pageContext.getRequest();
		out.println(req == request);
		out.println("br< />");
		ServletResponse resp = pageContext.getResponse();
		out.println(resp == response);
	%>

</body>
</html>