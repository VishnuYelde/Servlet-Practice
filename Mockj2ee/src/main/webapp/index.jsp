<html>
<body>
<h2><%= "Add User Page" %></h2>

	<form action="insertdata" method="post">
		
		<label for="name">Name:</label>
		<input type = "text" id="name" name="name" placeholder="Enter Your Name" required >
		
		<label for="email">Email:</label>
		<input type = "text" id="email" name="email" placeholder="Enter Your Email" required >
		
		<label for="phone">Phone:</label>
		<input type = "number" id="phone" name="phone" placeholder="Enter Your PhoneNo." required >
		
		<label for="address">Address:</label>
		<input type = "text" id="address" name="address" placeholder="Enter Your Address" required >
		
		<label for="age">Age:</label>
		<input type = "number" id="age" name="age" placeholder="Enter Your Age" required >


		<button type="submit">Submit</button>
		
<%-- 		<input type="url" value='<jsp:forward page="display.jsp"></jsp:forward>'> --%>
	</form>
</body>
</html>
