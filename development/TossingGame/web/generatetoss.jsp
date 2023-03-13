<%-- 
    Document   : generatetoss
    Created on : 13 Mar 2023, 9:36:27 AM
    Author     : Jakaza G Chauke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Generate Toss</h1>
        <form action="CompGameServlet.do" method="post">
            <input type="text" name="toss" placeholder="Enter Value" > <br> <br>
            <input type="submit" value="Submit" >
        </form>
    </body>
</html>
