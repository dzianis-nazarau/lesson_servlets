import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {

    Helper helper = new Helper();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("Username");
        String password = req.getParameter("Password");

        if(helper.checkCredo(username, password)) {
            Helper.currentUser = helper.getUserInfo(username);
            resp.sendRedirect("/myWeb_war/userPage");
        } else {
            resp.sendRedirect("/myWeb_war/main");
        }
    }

}
