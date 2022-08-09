<!-- 
	계산 결과 출력 페이지
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
	정답은??
	<%
		String result1 = request.getParameter("first");
		int a = Integer.parseInt(result1);
		String result2 = request.getParameter("second");
		int b = Integer.parseInt(result2);
		String operator = request.getParameter("operator");
	
		if (operator.equals("plus")) {
			out.println(a + b); 
		} else if (operator.equals("minus")) {
			out.println(a - b); 
		} else if (operator.equals("multiply")) {
			out.println(a * b); 
		} else if (operator.equals("divide") && b != 0) {
			out.println(a / b); 
		} else {
			out.println("0은 넣을수 없어요");
		}
	%>
</body>
</html>

