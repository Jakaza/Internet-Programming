<html>
	<head>
		<title>Home Page</title>
	</head>
	<body>
	
	<%
		String username = (String) session.getAttribute("username");
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		Integer age = Integer.parseInt(request.getParameter("age"));
		
	%>

		<!---  output ----->
		<h1> Hi <%= username%>, Thank you for submitting your details</h1>
		
		<ul>
			<li>Name : <%= username%></li>
			<li>Email : <%= email%></li>
			<li>Contact : <%= contact%></li>
			<li>Age : <%= age%></li>
		</ul>
		
		<h3>You are now part of our familly please click <a href="output2.jsp">here</a> to confirm details or <a href="name_entry.jsp">here</a> to resubmit.</h3>

	</body>
</html>