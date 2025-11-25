<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String name = request.getParameter("username");
		String email = request.getParameter("useremail");
		String address = request.getParameter("useraddress");
	%>
	
	<!-- 3 ways to print data -->
	
	<h1>User Details</h1>
	<h2>Name: <%=name %></h2>
	<h2>Email: <%=email %></h2>
	<h2>Address: <%=address %></h2>
	
	<hr>
	
	<h1>User Details</h1>
	<h2>Name: <%=request.getParameter("username") %></h2>
	<h2>Email: <%=request.getParameter("useremail") %></h2>
	<h2>Address: <%=request.getParameter("useraddress") %></h2>
	
	<hr>
	
	<h1>User Info</h1>
	<h3>Name : ${param.username}</h3>
	<h3>Email : ${param.useremail}</h3>
	<h3>Add : ${param.useraddress}</h3>

</body>
</html>