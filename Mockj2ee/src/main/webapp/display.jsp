<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details</title>
</head>

<body>

	<h1>User Details</h1>

	<%
	String driver = "org.postgresql.Driver";
	String url = "jdbc:postgresql://localhost:5432/mock?user=postgres&password=Vishnu@2525";

	Class.forName(driver);

	try (Connection con = DriverManager.getConnection(url)) {
		String fetchQuery = "SELECT * FROM users";
		PreparedStatement ps = con.prepareStatement(fetchQuery);
		ResultSet rs = ps.executeQuery();
	%>

	<table border="1" cellpadding="6">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Address</th>
			<th>Age</th>
		</tr>

		<%
		while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getString("email")%></td>
			<td><%=rs.getLong("phone")%></td>
			<td><%=rs.getString("address")%></td>
			<td><%=rs.getInt("age")%></td>
		</tr>
		<%
		}
		%>
	</table>

	<%
	} catch (SQLException e) {
	e.printStackTrace();
	}
	%>

</body>
</html>
