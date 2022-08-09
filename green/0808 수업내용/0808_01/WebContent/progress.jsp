<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
	<p>로그인 처리 요청이 전달되었나요?</p>

	<%
		// 방금 겟으로 보냈기때문에 get으로 받는다.
		// 이 방식은 스트링으로 전달해준다.
		String id = request.getParameter("userid");
	// 입력값이 있으면 XX님 반갑습니다.
	// 입력값이 없으면...? "" 빈문자열로 온다.
	// 파라미터 이름이 없으면 null로 출력한다.

	if (id.length() > 0) {
		out.println(id + "님 반갑습니다.");
	} else {
		out.println("입력해주세요.");
	
		// redirect는 사용자에게 요구하는 것
		// redirect는 응답이다. request와 짝을 이루는 response라는 객체(?)로 전달이 가능하다.
		// redirect는 호출하는 메소드
		// sendRedirecet는 flush가 되지 않는다.
		// 사용자 입장에서는 flush가 되지 않아 아무것도 보이지 않기 때문에 
		// redirect하라는 걸 보면 페이지 이동이 일어나는 것처럼 보인다.
		// 요청을 두번 받는것??
		response.sendRedirect("./login.jsp");
	}
	
	%>

</body>
</html>