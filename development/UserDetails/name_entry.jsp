<html>
	<head>
		<title>Home Page</title>
	</head>
	<body>
		<!-- name entry jsp -->
		
		<h1>Please fill in the form below</h1> <br>
		<hr>
		<form action="PersonalisedGreetingServlet.do" method="post">
			<input type="text" name="username" placeholder="Please Enter Your Name"> <br>
			<input type="email" name="email" placeholder="Please Enter Your Email"> <br>
			<input type="text" name="contact" placeholder="Please Enter Your Contact"> <br>
			<input type="number" name="age" placeholder="Please Enter Your Age"> <br>
			<input type="submit" name="Submit"> <br>
		</form>
		
	</body>
</html>