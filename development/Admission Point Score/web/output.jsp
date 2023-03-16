<%-- 
    Document   : output
    Created on : 16 Mar 2023, 9:30:04 AM
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
            Integer aps = (Integer)request.getAttribute("aps");
            String outcome = (String)request.getAttribute("outcome");
            String major = (String)request.getAttribute("major");
        %>
        <h2>Here is your APS and result below.</h2>
        <h2>Your APS : <%= aps %></h2>
        <h2><%= outcome %></h2> 
        
        <h3>Click <a href="subject_entry.jsp">here</a> to enter the grades obtained by students at matric (NSC) </h3>
        <h3>Click <a href="index.html">here</a> to return to home page. </h3>
          
    </body>
</html>
