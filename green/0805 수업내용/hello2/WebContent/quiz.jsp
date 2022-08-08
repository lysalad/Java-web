<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Arrays"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>퀴즈퀴즈퀴즈</title>
</head>
<body>

	<p>다음 문제의 답을 입력하세요.</p>

	<%-- 	<%
	List<String> quiz = new ArrayList<>();
	quiz.add("탕수육을 먹을 때 부먹vs찍먹?");
	quiz.add("레드벨벳 최애 멤버는 ???? ");
	quiz.add("혜령이를 감당할 수 있는 유일한 인재는 ???");
	
	이런식으로 배열에 넣고
	답도 배열에다가 넣어서
	두 배열의 값끼리 Map으로 짝을 만들어주고
	
	그다음에 구해주면 될거같은데 안되려나 ??????
	안되나 ???
	Map으로 짝을 만들어주는건 정답페이지 가서 해야하나 ??
	주말동안 해보기!!!
	
	%>  --%>

	
	

	<p>탕수육을 먹을 때 부먹vs찍먹?</p>

	<form action="/everyone/quizA.jsp" method="post">

		<%-- 사용자 입력을 받을 수 있는 form 만들기 --%>
		<label> 답은 여기! <input type="text" name="answer" />
		</label> <label><input type="checkbox" name="ect" values="ect">
			기타</label> <input type="submit" value="정답 입력" />


	</form>

</body>
</html>