public class Utils {

    final static String mainPage = "        <h1>Welcome to start page</h1>\n" +
            "        <form action='denis' method='POST'>\n" +
            "            Name: <input name='Username' />\n" +
            "            Password: <input name='Password' />\n" +
            "            <input type='submit' value='Login' />\n" +
            "        </form>\n" +
            "        <p><a href=\"http://localhost:8080/myWeb_war/registration\">Registration</a></p>";

    final static String registarionPage = "<form action=\"thanks\" method=\"POST\">\n" +
            "    Login: <input name=\"login\" />\n" +
            "    <br><br>\n" +
            "    Password: <input name=\"password\" />\n" +
            "    <br><br>\n" +
            "    Name: <input name=\"username\" />\n" +
            "    <br><br>\n" +
            "    Age: <input name=\"userage\" />\n" +
            "    <br><br>\n" +
            "    Gender: <input type=\"radio\" name=\"gender\" value=\"female\" checked />Female\n" +
            "    <input type=\"radio\" name=\"gender\" value=\"male\" />Male\n" +
            "    <br><br>\n" +
            "    Country: <select name=\"country\">\n" +
            "        <option>Canada</option>\n" +
            "        <option>Spain</option>\n" +
            "        <option>France</option>\n" +
            "        <option>Germany</option>\n" +
            "    </select>\n" +
            "    <br><br>\n" +
            "    <input type=\"submit\" value=\"Submit\" />\n" +
            "</form>";
    final static String userPage =   "        <p><a href=\"http://localhost:8080/myWeb_war/main\">Exit</a></p>" +
            "        <p><a href=\"http://localhost:8080/myWeb_war/information\">Information</a></p>";
}
