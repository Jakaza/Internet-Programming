<html>
	<head>
		<title>Home Page</title>
	</head>
	<body>
	
	<%
		String username = (String) session.getAttribute("username");
	%>

		<!---  output ----->
		<h1> Hi <%= username%>, you are on our database.</h1>
		
	</body>
</html>