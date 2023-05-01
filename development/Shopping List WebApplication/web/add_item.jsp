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
        <h1>Add New item</h1>
        <p>Please enter below the details of an item to add.</p>
        
        <form action="ProcessingServlet.do" method="post">
            <table>
                <tr>
                    <th>ID : </th>
                    <th><input type="text" name="id" /> </th>
                </tr>
                <tr>
                    <th>Description : </th>
                    <th><input type="text" name="description" /> </th>
                </tr>
               <tr>
                    <th>Price R: </th>
                    <th><input type="text" name="price" /> </th>
                </tr>
                <tr>
                     <th><input type="submit" value="Add" /> </th>
                     <th><input type="text" name="op" value="add" hidden="true" /> </th>
                </tr>
            </table>
            
        </form>
        
    </body>
</html>
