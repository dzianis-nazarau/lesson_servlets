<%--
  Created by IntelliJ IDEA.
  Servlets.User: Servlets.User
  Date: 15.11.2020
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>MyWebApp</title>
</head>
<body>
    <h2>Welcome to your page, <%= session.getAttribute("user")%></h2>

    <p><a href="http://localhost:8080/myWeb_war/information">Information</a></p>
    <p><a href="http://localhost:8080/myWeb_war/store">Store</a></p>
    <p><a href="http://localhost:8080/myWeb_war/basket">Basket</a></p>
    <p><a href="http://localhost:8080/myWeb_war/shopHistory">Shop history</a></p>
    <p><a href="http://localhost:8080/myWeb_war/logout">Exit</a></p>


</body>
</html>
