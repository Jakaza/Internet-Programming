<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h3>Hello, Computer generated toss Head or Tail</h3>
        <h3>Head is 1 and Tail is 0</h3>
        <h3>Guess Generated Value :</h3>
        <form action="GameServlet.do" method="post">
            <input type="text" name="userguess" placeholder="Enter Value"> <br> <br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
