<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 15.11.2020
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Gender</th>
        <th>Country</th>
        </tr>
    <tr>
        <td><%= request.getAttribute("username")%></td>
        <td><%= request.getAttribute("userage")%></td>
        <td><%= request.getAttribute("usergender")%></td>
        <td><%= request.getAttribute("usercountry")%></td>
        </tr>
    </table>

    <p><a href="http://localhost:8080/myWeb_war/userPage">Back</a></p>

</body>
</html>
