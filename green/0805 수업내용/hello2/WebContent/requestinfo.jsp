<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request Info</title>
</head>
<body>

	클라이언트 IP=
	<%=request.getRemoteAddr()%>
	<br> 요청정보 길이 =
	<%=request.getContentLength()%>
	<br> 요청정보 인코딩 =
	<%=request.getCharacterEncoding()%>
	요청정보 컨텐츠타입 =
	<%=request.getContentType()%>
	<br> 요청정보 프로토콜 =
	<%=request.getProtocol()%>
	<br> 요청정보 전송방식 =
	<%=request.getMethod()%>
	<br> 요청 URI =
	<%=request.getRequestURI()%>
	<br> 컨텍스트 경로 =
	<%=request.getContextPath()%>
	<br> 서버이름 =
	<%=request.getServerName()%>
	<br> 서버포트 =
	<%=request.getServerPort()%>
	<br> ----------------------------------------------------
	<% request.setCharacterEncoding("utf-8"); %>
	
	<%=request.getRequestURL()%>
	<%=request.getQueryString()%>
	<br> 사용자 이름 =
	<%=request.getParameter("name")%>
	<br /> 사용자 나이 =
	<%=request.getParameter("age")%>
	<br /> 사용자 성별 =
	<%=request.getParameter("gender")%>
	<%-- 여러개를 가지고 있을때는 파라미터 밸류스를 쓰는데, 배열이라서 투스트링을 써야한다. --%>
	<br /> 사용자 취미 =
	<%=Arrays.toString(request.getParameterValues("hobby"))%>
	<br>



	<%
		Map<String, String[]> map = request.getParameterMap();

	for (Entry<String, String[]> e : map.entrySet()) {
		String key = e.getKey();
		String[] value = e.getValue();
	%>
	<%=key%><br />
	<%=Arrays.toString(value)%><br />
	<%
		}
	%>
</body>
</html>