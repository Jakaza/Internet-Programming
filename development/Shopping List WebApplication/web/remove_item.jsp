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
        <h1>Remove item</h1>
        <p>Please enter below the id of an item to remove.</p>
        
        <form action="ProcessingServlet.do" method="post">
            <table>
               <tr>
                    <th>ID: </th>
                    <th><input type="text" name="id" /> </th>
                </tr>
                <tr>
                     <th><input type="submit" value="Remove" /> </th>
                     <th><input type="text" name="op" value="remove" hidden="true" /> </th>
                </tr>
            </table>
            
        </form>
        
    </body>
</html>
