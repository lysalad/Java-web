<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.Arrays"%>
<%@ page import="java.util.Map.Entry"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정답확인 페이지</title>
</head>
<body>
	
	<%
		request.setCharacterEncoding("utf-8");
	%>

<%-- 
	<%=request.getRequestURL()%>
	<%=request.getQueryString()%>
	<br> 사용자 정답 =
	<%=request.getParameter("answer")%>
	<br> 기타 여부 =
	<%=request.getParameter("ect")%>

	<%
		Map<String, String[]> map = request.getParameterMap();

	for (Entry<String, String[]> e : map.entrySet()) {
		String key = e.getKey();
		String[] value = e.getValue();
	%>
	<%=key%>
	<br>
	<%=Arrays.toString(value)%><br>
	<%
		}
	%>
	--%>
	<p> 정답 확인 </P>
	<%
		String result = "";
	
		if(request.getParameter("answer").equals("부먹")) {
			result = "당신은 부먹파입니다. 소스맛이 일품!";
		} else if(request.getParameter("answer").equals("찍먹")) {
			result = "당신은 찍먹파입니다. 바삭바삭한 맛이 일품!";
		} else if(request.getParameter("answer").equals("처먹")) {
			result = "정답!!!! 탕수육은 먹고 봐야지!";
		} else {
			result = "성의있는 답변. 원한다. 나.";
		}
	%>
	<p> <strong> <%=result %> </strong>  탕수육은 어떻게 먹어도 옳다!</p>


</body>
</html>