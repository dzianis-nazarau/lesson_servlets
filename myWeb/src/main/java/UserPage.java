import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userPage")
public class UserPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String forwardPage;
        String userLogin = Helper.currentUser.getLogin();
        req.getSession().setAttribute("user", userLogin);
        if (userLogin.equals("admin")) {
            forwardPage = "/jsp/adminPage.jsp";
        } else {
            forwardPage = "/jsp/userPage.jsp";
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(forwardPage);
        requestDispatcher.forward(req, resp);
    }
}
