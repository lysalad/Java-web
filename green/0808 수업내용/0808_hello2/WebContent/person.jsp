<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인적정보</title>
</head>
<body>

<!--  입력 폼 
	사용자 이름과 나이는 필수
	그 외 더하기...	
-->



<form action="./personresult.jsp" >

	<input type="text" name="name" value="이름을 입력해주세요." />
	<input type="number" name="age" value="나이를 입력해주세요." />
	<input type="submit" name="제출하기" />
	
	
	<%-- 
	<%
		String inputName = request.getParameter("name");
		String inputAge = request.getParameter("age").toString();
		
		if (inputAge.equals("") || inputName.equals("")) {
			// 경고창 띄우는거 어떻게 하지용 ...?
			// alret("빈칸을 채워주세요.");
		}
	%>
	--%>
	
	
</form>

</body>
</html>