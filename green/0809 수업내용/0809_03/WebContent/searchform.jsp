<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>serch DB</title>
</head>
<body>
	<%-- 사용자가 대륙을 선택--%>
	<%-- 선택한 태륙의 국가들이 나오고 그 국가들의 이름, 인구를 볼 수 있는 페이지(인구 내림차순 정렬)
	 select continent, name, Population from country order by Continent desc; --%>


	<%
		// db 연결
	// select

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	List<String> list = new ArrayList<>();
	try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT Distinct continent FROM country");

		while (rs.next()) {
			String name = rs.getString("continent");
			list.add(name);
		}
	} finally {
		if (rs != null) {
			rs.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}
	}
	%>
	<p>DB에 있는 정보를 가져와서</p>
	<P>대륙별 나라 이름과 인구를 내림차순으로 정렬하기</P>

	<form action="selectContinent.jsp" method="post">
		<select name="continent">
		
		<%--
		<label> North America <input type="checkbox" name="continene" value="north America"/> </label>
		<label> Asia <input type="checkbox" name="continene" value="asia"/> </label>
		<label> Africa <input type="checkbox" name="continene" value="africa"/> </label>
		<label> Europe <input type="checkbox" name="continene" value="europe"/> </label>
		<label> South America <input type="checkbox" name="continene" value="south America"/> </label>
		<label> Oceania <input type="checkbox" name="continene" value="oceania"/> </label>
		<label> Antarctica <input type="checkbox" name="continene" value="antarctica"/> </label>
		 --%>

		<%
			for (int i = 0; i < list.size(); i++) {
		%>

		<option value="<%=list.get(i)%>"><%=list.get(i)%></option>

		<%
			}
		%>

		</select>
		<input type="submit" />

	</form>

</body>
</html>