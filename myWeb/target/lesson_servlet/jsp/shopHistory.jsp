<%@ page import="Servlets.Helper" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 17.11.2020
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyWebApp</title>
</head>
<body>
<table>
    <tr>
        <th>Date & Time</th>
        <th>Details</th>
        <th>Delivery</th>
    </tr>

    <%
        for(int i = 0; i < Helper.currentUser.getOrders().size(); i++) {
    %>

    <tr>
        <td><%= Helper.currentUser.getOrders().get(i).getDate()%></td>
        <td><%= Helper.currentUser.getOrders().get(i).getDetails()%></td>
        <td><%= Helper.currentUser.getOrders().get(i).getDelivery()%></td>
    </tr>
    <%
        }
    %>

</table>

<p><a href="http://localhost:8080/myWeb_war/userPage">Back</a></p>

</body>
</html>
