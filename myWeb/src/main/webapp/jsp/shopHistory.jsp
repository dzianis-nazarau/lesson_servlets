<%@ page import="Servlets.Helper" %>
<%@ page import="Servlets.User" %><%--
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

    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: center;
        }
    </style>

</head>
<body>
<table>
    <tr>
        <th>Date & Time</th>
        <th>Details</th>
        <th>Delivery</th>
    </tr>

    <%
        User currentUser = (User) session.getAttribute("currentUser");
        for(int i = 0; i < currentUser.getOrders().size(); i++) {
    %>

    <tr>
        <td><%= currentUser.getOrders().get(i).getFormattedDate()%></td>
        <td><%= currentUser.getOrders().get(i).getDetails()%></td>
        <td><%= currentUser.getOrders().get(i).getDelivery()%></td>
    </tr>
    <%
        }
    %>

</table>

<p><a href="http://localhost:8080/myWeb_war/userPage">Back</a></p>

</body>
</html>
