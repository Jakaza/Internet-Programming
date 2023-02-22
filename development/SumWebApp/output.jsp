<html>
	<head>
	<title>Home Page | Sum Two Numbers</title>
	</head>
	<body>
	
	<!--- output.jsp ---->
	<%
	
		Integer num1 = Integer.parseInt(request.getParameter("num1"));
		Integer num2 = Integer.parseInt(request.getParameter("num2"));
		Integer sum = num1 + num2;
	
	%>
	
	<hr>
	<h1>Sum of <%= num1 %> and <%= num2 %> is : <%= sum %></h1>
	
	</body>

</html>