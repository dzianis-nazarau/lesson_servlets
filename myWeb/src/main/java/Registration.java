import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registration")
public class Registration extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/registration.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String username = req.getParameter("username");
        String userage = req.getParameter("userage");
        String gender = req.getParameter("gender");
        String country = req.getParameter("country");

        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        user.setCountry(country);
        user.setGender(gender);
        user.setUserage(userage);
        user.setUsername(username);

        Helper.users.add(user);

        if (req.getSession().getAttribute("user") != null && req.getSession().getAttribute("user").equals("admin")) {
            resp.sendRedirect("/myWeb_war/userPage");
        } else {
            resp.sendRedirect("/myWeb_war/main");
        }

    }
}
