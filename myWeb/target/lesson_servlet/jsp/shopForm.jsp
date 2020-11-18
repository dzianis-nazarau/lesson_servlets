<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 18.11.2020
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyWebApp</title>
</head>
<body>
    <form action="delivery" method="POST">
        GetPurchases: <select name="delivery">
            <option>pickup</option>
            <option>delivery</option>
        </select>
        <input type="submit" value="Confirm" />
    </form>
</body>
</html>
