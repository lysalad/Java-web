<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인적정보</title>
</head>
<body>
	<!-- 
		입력폼
		사용자 이름
		사용자 나이 
	 -->
	 
	 <form action="welcome.jsp">
	 	<%-- required attribute를 줬다.
	 	하지만, require은 submit의 요청만 거부할 수 있다.
	 	주소에다가 바로 요청을 한다면...? 당연히 안 된다.
	 	일반적인 사용자는 버튼만 누를 생각을 하겠지만,
	 	요청이라는 걸 화면에서 말고도 http 요청을 할 수 있는 클라이언트는
	 	주소창에 바로 요청을 할 수도 있고... 그러면... 머 어쩌라고
	 	
	 	그렇다면 우리는 사용자 입력 폼에서 필수값을 입력할 수 있도록
	 	배려를 해줘야 하는 것은 당연하면서,
	 	로직 처리를 하기 전에도 입력값을 꼭 검사해야한다.
	 	http 클라이언트는 브라우저 말고도 요청을 가진 기능을 가진 소프트웨어라면?
	 	이런걸 고려해야한다는 말인데.... 아직 와닿지는 않는다.
	 	논리적인 부분을 작성할때는 화면과는 무관하게,
	 	입력값이 제대로 왔는지 전부 꼭 확인을 해야한다!--%>
	 	
	 	이름 <input type="text" name="name" required />
	 	나이 <input type="number" name="age" required />
	 	<input type="submit">
	 </form>
</body>
</html>