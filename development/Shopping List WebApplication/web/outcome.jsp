<%-- 
    Document   : outcome
    Created on : 01 May 2023, 2:54:08 PM
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
        
        <% 
            String outcome = (String)request.getAttribute("outcome");
        %>
        <h1>Outcome</h1>
        <p> <b><%= outcome %></b> </p>
         <p>Please click  <a href="menu.jsp">here</a>  to go back  to the menu</p>
         <p>Please click  <a href="index.html">here</a>  to go back  to the home page</p>
    </body>
</html>
