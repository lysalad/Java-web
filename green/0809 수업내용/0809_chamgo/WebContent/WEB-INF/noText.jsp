<%
	int result = 1 + 1;
	request.setAttribute("result", result);
	request.getRequestDispatcher("/WEB-INF/viewPage.jsp")
	.forward(request, response);
%>