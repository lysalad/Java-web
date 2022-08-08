<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Arrays"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Random"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.HashMap"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>퀴즈퀴즈퀴즈</title>
</head>
<body>

	<p>다음 문제의 답을 입력하세요.</p>

	<%
	
	Random r = new Random();
	int num = r.nextInt(5)+1;
	
	Map<Integer, String> quizMap = new HashMap<>();
	
	quizMap.put(1, "탕수육을 먹을 때 부먹vs찍먹?");
	quizMap.put(2, "레드벨벳 최애 멤버는 ???? ");
	quizMap.put(3, "혜령이를 감당할 수 있는 유일한 인재는 ???");
		
	%>
	
	<%-- 왜<p>에다가 안넣고 바로 하는건지 ?? 바로 해도 나오나 ???--%>
	<%= quizMap.get(num).toString() %>
	
	



	<form action="/everyone/quizA.jsp" method="post">

		<%-- 사용자 입력을 받을 수 있는 form 만들기 --%>
		<label> 답은 여기! <input type="text" name="answer" />
		</label> <label><input type="checkbox" name="ect" values="ect">
			기타</label> <input type="submit" value="정답 입력" />


	</form>

</body>
</html>