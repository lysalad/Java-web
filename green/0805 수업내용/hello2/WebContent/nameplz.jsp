<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 정보 입력받기</title>
</head>
<body>

	<%-- 사용자의 이름(name)과 나이(age) 성별을 입력받을 수 있는 <form> 양식
작성해보기~ --%>

	<%-- 폼은 연결시킬 수 있다.
	그리고 메소드도 넣을 수 있다.
	post에 대해 알아보기 ~--%>
	<form action="/everyone/requestinfo.jsp" method="post">

		<label> 이름 <input type="text" name="name" /></label>
		<label> 나이 <input type="number" name="age" /></label>
		
		<label><input type="radio" name="gender" value="male" /> 남자</label>
		<label><input type="radio" name="gender" value="female" /> 여자</label>
		
		<label><input type="checkbox" name="hobby" value="java">자바</label>
		<label><input type="checkbox" name="hobby" value="html">하이퍼텍스트마크업 랭귀지</label>
		<label><input type="checkbox" name="hobby" value="css">캐스캐이딩 스타일 시트</label>
		
		<label><input type="checkbox" name="hobby" value="javascript">자바스크립트</label>		
		
		<input type="submit" value="입력 완료" />

	</form>



</body>
</html>