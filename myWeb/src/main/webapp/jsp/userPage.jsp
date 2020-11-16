<%--
  Created by IntelliJ IDEA.
  User: User
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

    <p><a href="http://localhost:8080/myWeb_war/logout">Exit</a></p>
    <p><a href="http://localhost:8080/myWeb_war/information">Information</a></p>

</body>
</html>
