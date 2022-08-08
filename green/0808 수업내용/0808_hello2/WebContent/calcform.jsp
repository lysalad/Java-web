<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!--  입력 폼
    숫자 1
    숫자 2
    연산자 + - * / 선택 전송 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산 입력</title>
</head>
<body>
	<form>
	
	<input type="number" name="number1" />
	<input type="number" name="nember2" />
	<input type="button" value="+" name="plus" />
	<input type="button" value="-" name="min" />
	<input type="button" value="*" name="mlt" />
	<input type="button" value="/" name="div" />
	<input type="submit" value="계산결과" name="results" />
		
	</form>
	
</body>
</html>