<!--  오늘 날짜를 보여줄 수 있는 jsp 페이지 -->



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jsp에서 필요한 설정들을 미리 해놓는 공간
    //page directive -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		// 여기는 자바를 쓸 수 있는 공간이다. scripter영역
		// 일반적인 jsp랑은 차이가 있다.
		System.out.println("사용자가 jsp 페이지를 요청했습니다.");
		// 변수 선언 하고 밑에서 변수를 불러줌
		int a = 10;
	%>
	<p> jsp 페이지 입니다. </p>
	<strong> <%= java.time.LocalTime.now() %> </strong><br/>
	<p> a의 값은 <%= a %> 입니다.</p>
	
	<%-- <p> b의 값은 <%= b %> 입니다.</p>
	
	<% int b = 20; %> --%>
	
</body>
</html>