<%--
  Created by IntelliJ IDEA.
  Servlets.User: Servlets.User
  Date: 14.11.2020
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyWebApp</title>
</head>
<body>
    <h1>Welcome to my webapp, stranger</h1>
    <div class="form">
        <form action='login' method='POST'>
            Login: <input name='Username' />
            Password: <input name='Password' />
            <input type='submit' value='Login' />
        </form>
    </div>
    <p><a href=/myWeb_war/registration>Registration</a></p>
</body>
</html>
