<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- 자동으로 설정돼있다. --%>
<%@ page autoFlush="true"%>

<%-- 위와 아래는 같다. 
    <% 
    	out.println("<!DOCTYPE html>");
    %>
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out 기본객체</title>
</head>
<body>

	<h1>정적 텍스트</h1>

	<%=1 + 2 + 3%>
	
	<br />
	
	<%
		out.println(1 + 2 + 3);
	out.println("<br />");
	%>

	<p>out 객체가 jsp의 모든 텍스트를 출력한다.</p>

	<%
		boolean someBool = true;

	if (someBool) {
		out.println("<p> 참일 때 출력해야하는 텍스트 </p>");
	} else {
		out.println("<p> 거짓일 때 출력해야하는 텍스트 </p>");
	}
	
	%>
	
</body>
</html>