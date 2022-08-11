<%@page import="kr.co.greenart.Country"%>
<%@page import="kr.co.greenart.CountryDAO"%>
<%@page import="java.util.List"%>
<%
	String continent = request.getParameter("continent");
	CountryDAO dao = new CountryDAO();
	List<Country> list = dao.getCountryByContinent(continent);
	
	request.setAttribute("list", list);
	request.getRequestDispatcher("result.jsp").forward(request, response);
%>