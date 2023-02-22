<html>
	<head>
		<title>Home Page | Welcome User</title>
	</head>
	<body>
	
		<% 
			String username = request.getParameter("username");
		
		%>
		
		<h1>Hi <%= username %>, How i hope you enjoy our Web Applications Development.</h1>
		
	</body>
</html>