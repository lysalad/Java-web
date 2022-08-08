<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%--메소드는 선언부에서 만들어줄 수 있는데, 선언부는 !를 붙인다. --%>
<%!public int getSum(int lastsNumber) {
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			sum += i;
		}

		return sum;
	}%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>합 구하기</title>
</head>
<body>
	<p>jsp 페이지에서 java scriptlet을 활용한 합계 구하기</p>
	<%
		int sum = 0;
	for (int i = 0; i < 11; i++) {
		sum += i;
	}
	%>
	<%--사실 이런애들은 그냥 적어도 된다... 그냥 이렇게 쓸수도 있다는 것 --%>
	<p>
		0~10까지의 합 :
		<%=sum%>
		입니다.
	</p>
	<p>0~100까지의 합 : <%= getSum(100) %> </p>
	
	<p>
		<%=1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10%></p>
	<p><%="문자열 값"%></p>
	<p><%=true%></p>
	<p><%=123.456%></p>

</body>
</html>