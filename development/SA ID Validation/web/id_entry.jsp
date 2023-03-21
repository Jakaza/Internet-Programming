<%-- 
    Document   : id_entry
    Created on : 21 Mar 2023, 9:56:05 AM
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
        <h1>Enter ID number below</h1>
        <form action="IDValidatorServlet.do" method="post">
            <input type="text"  name="id_number"> <br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
