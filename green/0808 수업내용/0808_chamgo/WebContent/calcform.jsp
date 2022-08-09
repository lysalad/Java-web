<!-- 입력 폼
	숫자1
	숫자2
	
	연산자 + - * / 선택
	전송
	 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./calcresult.jsp">
	<input type = "text" name = "first">
	<select id = "select_value" name = "operator">
		<option value = "plus">+</option>
		<option value = "minus">-</option>
		<option value = "multiply">*</option>
		<option value = "divide">/</option>
	</select>
	<input type = "text" name = "second">
	<input type = "submit" value = "연산">
</form>
</body>















</html>