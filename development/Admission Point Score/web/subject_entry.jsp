<%-- 
    Document   : subjject_entry
    Created on : 16 Mar 2023, 8:31:35 AM
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
        <h1>Enter his/her NSC grades ,together with the respective subject names below.</h1>
        
        <form action="SubjectSevlet.do" method="post">
                    <table>
            <tr>
                <th>Subject Name</th>
                <th>NSC grade</th>
            </tr>
            <tr>
                <th>
                    <select name="major">
                        <option value="math">Mathematics</option>
                        <option value="tech">Technical Mathematics</option>
                        <option value="lit">Math Literacy</option>
                    </select>
                </th>
                <th>
                    <input type="text" name="math">
                </th>
            </tr>
            
            <tr>
                <td><input type="text" name="subject2"></td>
                <td><input type="text" name="subject2-mark"></td>
            </tr>
            <tr>
                <td><input type="text" name="subject3"></td>
                <td><input type="text" name="subject3-mark"></td>
            </tr>
            <tr>
                <td><input type="text" name="subject4"></td>
                <td><input type="text" name="subject4-mark"></td>
            </tr>
            <tr>
                <td><input type="text" name="subject5"></td>
                <td><input type="text" name="subject5-mark"></td>
            </tr>
            <tr>
                <td><input type="text" name="subject6"></td>
                <td><input type="text" name="subject6-mark"></td>
            </tr>
        </table>
             
        <input type="submit" value="Submit">
            
        </form>
        
    </body>
</html>
