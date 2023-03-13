
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String winner = (String)request.getAttribute("winner");
            Integer cScore = (Integer)request.getAttribute("cScore");
            Integer uScore = (Integer)request.getAttribute("uScore");    
        %>
        <h2>Result :   <%= winner%></h2>
        <h2>Computer Score : <%= cScore%></h2>
        <h2>User Score : <%= uScore%></h2>
        
        <h2><a href="index.html">Home Page</a></h2>
    </body>
</html>
