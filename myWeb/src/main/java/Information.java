import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/information")
public class Information extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = Helper.currentUser;

        req.setAttribute("username", user.getUsername());
        req.setAttribute("userage", user.getUserage());
        req.setAttribute("usergender", user.getGender());
        req.setAttribute("usercountry", user.getCountry());

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/information.jsp");
        requestDispatcher.forward(req, resp);
    }
}
