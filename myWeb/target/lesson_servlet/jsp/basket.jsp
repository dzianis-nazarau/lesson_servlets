<%@ page import="purchase.Warehouses" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Servlets.Helper" %><%--
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
</head>
<body>
<table>
    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>MyCount</th>
    </tr>

    <%
        for(int i = 0; i < Helper.currentUser.getBasket().size(); i++) {
    %>

    <tr>
        <td><%= Helper.currentUser.getBasket().get(i).getName()%></td>
        <td><%= Helper.currentUser.getBasket().get(i).getDescription()%></td>
        <td><%= Helper.currentUser.getBasket().get(i).getCount()%></td>
        <td>
            <form action='basket' method='POST'>
                <select name="item">
                    <option><%= Helper.currentUser.getBasket().get(i).getName() %></option>
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
