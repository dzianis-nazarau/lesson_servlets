<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 17.11.2020
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyWebApp</title>
</head>
<body>

<form action="createItem" method="POST">
    Name: <input name="name" />
    <br><br>
    Description: <input name="description" />
    <br><br>
    Count: <input name="count" />
    <br><br>
    <input type="submit" value="Add" />
</form>
</body>
</html>
