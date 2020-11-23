<%@ page import="purchase.Warehouses" %><%--
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
            <th>In stock</th>
            <th>Purchase</th>
        </tr>

        <%
            for(int i = 0; i < Warehouses.storeItemsList.size(); i++) {
        %>

        <tr>
            <td><%= Warehouses.storeItemsList.get(i).getName()%></td>
            <td><%= Warehouses.storeItemsList.get(i).getDescription()%></td>
            <td><%= Warehouses.storeItemsList.get(i).getCount()%></td>
            <td>
                <form action='store' method='POST'>
                    <input name="count" />
                    <select name="item" hidden = "true">
                        <option><%= Warehouses.storeItemsList.get(i).getName()%></option>
                    </select>
                    <input type='submit' value='buy' />
                </form>
            </td>
        </tr>
        <%
            }
        %>

    </table>

    <p><a href="http://localhost:8080/myWeb_war/userPage">Back</a></p>

</body>
</html>
