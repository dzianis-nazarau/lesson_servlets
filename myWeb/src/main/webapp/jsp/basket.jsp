<%@ page import="purchase.Warehouses" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Servlets.Helper" %>
<%@ page import="Servlets.User" %><%--
  Created by IntelliJ IDEA.
  Servlets.User: Servlets.User
  Date: 16.11.2020
  Time: 20:19
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
        <th>Name</th>
        <th>Description</th>
        <th>MyCount</th>
        <th>Action</th>
    </tr>

    <%
        User currentUser = (User) session.getAttribute("currentUser");
        for(int i = 0; i < currentUser.getBasket().size(); i++) {
    %>

    <tr>
        <td><%= currentUser.getBasket().get(i).getName()%></td>
        <td><%= currentUser.getBasket().get(i).getDescription()%></td>
        <td><%= currentUser.getBasket().get(i).getCount()%></td>
        <td>
            <form action='basket' method='POST'>
                <select name="item" hidden="true">
                    <option><%= currentUser.getBasket().get(i).getName() %></option>
                </select>
                <input type='submit' value='delete' />
            </form>
        </td>
    </tr>
    <%
        }
    %>

</table>

<p><a href="http://localhost:8080/myWeb_war/delivery">Shop</a></p>

<p><a href="http://localhost:8080/myWeb_war/userPage">Back</a></p>

</body>
</html>
