<%-- 
    Document   : add_item
    Created on : 01 May 2023, 2:37:42 PM
    Author     : Jakaza G Chauke
--%>

<%@page import="za.ac.tut.model.Item"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <% 
            Integer numItems = (Integer)request.getAttribute("numItems");
            List<Item> items = (List<Item>)request.getAttribute("items");
        %>
        
        <h1>List of all items</h1>
        <p><b>There are <%= numItems%> in the cart : </b> <%= items%></p>
        <p>Please click  <a href="menu.jsp">here</a>  to go back  to the menu</p>
         <p>Please click  <a href="index.html">here</a>  to go back  to the home page</p>
        
    </body>
</html>