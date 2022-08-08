
	<%-- 리다이렉트 페이지의 내용은 다 필요없어서
	논리의 흐름만 있어도 된다.
	대부분의 웹페이지는 논리와 보여주는 페이지를 분리시킨다. --%>
	
	<% 
	String choice = request.getParameter("choice2");
	System.out.println("choice2");
	
	if (choice.equals("hamo")) {
		response.sendRedirect("./fruit.jsp");
	} else {
		response.sendRedirect("./persons.jsp");
	}
	
	%>
