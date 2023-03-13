
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String result = (String)request.getAttribute("result");
            Integer toss = (Integer)request.getAttribute("toss");
            Integer compguess = (Integer)request.getAttribute("compguess");    
        %>
        <h2>User Generated Number is  <%= toss%></h2>
        <h2>Computer guess is  <%= compguess%></h2>
        <h2>Computer guess is <%= result%></h2>     
        <h2>Click <a href="userquess.jsp">here</a> to continue or <a href="EndGameSevlet.do">here</a> to end game</h2>
    </body>
</html>
