
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
            Integer userguess = (Integer)request.getAttribute("userguess");    
        %>
        <h2>Generated Number is  <%= toss%></h2>
        <h2>Your guess is  <%= userguess%></h2>
        <h2>Your guess is <%= result%></h2>
        
        <h2>Click <a href="generatetoss.jsp">here</a> to generate toss or <a href="EndGameSevlet.do">here</a> to end game</h2>
    </body>
</html>
