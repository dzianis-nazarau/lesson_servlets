import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/thanks")
public class Thanks extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String username = req.getParameter("username");
        String userage = req.getParameter("userage");
        String gender = req.getParameter("gender");
        String country = req.getParameter("country");

        User user = new User(login, password);
        user.setCountry(country);
        user.setGender(gender);
        user.setUserage(userage);
        user.setUsername(username);

        Helper.users.add(user);

        PrintWriter writer = resp.getWriter();
        try {
            if (Helper.currentUser.getLogin().equals("admin")) {
                writer.println("<h2>User created</h2>");
                writer.println("<h2>Welcome to your page, " + Helper.currentUser.getLogin() + "</h2>");
                writer.println(Utils.userPage);
                writer.println("<p><a href=\"http://localhost:8080/myWeb_war/registration\">Create user</a></p>");
            } else {
                writer.println("<h2>Thanks for registration!</h2>");
                writer.println(Utils.mainPage);
            }
        } finally {
            writer.close();
        }
    }
}
