<%--
  Created by IntelliJ IDEA.
  User: DoanTu
  Date: 8/26/2022
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student form</title>
</head>
<body>
    <h2>Please Input Student Information</h2>
    <form action="post" action="save">
        <table>
            <tr>
                <td>name</td>
                <td><input name="name" type="text"/></td>
            </tr>
            <tr>
                <td>Age</td>
                <td><input name="age" type="text"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input value="Submit" type="submit"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
