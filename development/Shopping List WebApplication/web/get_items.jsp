<%-- 
    Document   : add_item
    Created on : 01 May 2023, 2:37:42 PM
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
        <h1>Get items</h1>
        <p>Please click button to get all items</p>
        
        <form action="ProcessingServlet.do" method="post">
            <table>
                <tr>
                     <th><input type="submit" value="Get Items" /> </th>
                     <th><input type="text" name="op" value="list_items" hidden="true" /> </th>
                </tr>
            </table>
        </form>
        
    </body>
</html>
