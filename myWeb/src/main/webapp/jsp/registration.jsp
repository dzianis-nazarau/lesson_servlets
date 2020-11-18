<%--
  Created by IntelliJ IDEA.
  Servlets.User: Servlets.User
  Date: 14.11.2020
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyWebApp</title>
</head>
<body>

<form action="registration" method="POST">
    Login: <input name="login" />
        <br><br>
    Password: <input name="password" />
        <br><br>
    Name: <input name="username" />
        <br><br>
    Age: <input name="userage" />
        <br><br>
    Gender: <input type="radio" name="gender" value="female" checked />Female
            <input type="radio" name="gender" value="male" />Male
    <br><br>
    Country: <select name="country">
        <option>Canada</option>
        <option>Spain</option>
        <option>France</option>
        <option>Germany</option>
    </select>
    <br><br>
    <input type="submit" value="Submit" />
</form>

</body>
</html>
