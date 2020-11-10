import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {

    Helper helper = new Helper();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String username = req.getParameter("Username");
        String password = req.getParameter("Password");
        PrintWriter writer = resp.getWriter();

        if(helper.checkCredo(username, password)) {
            try {
                writer.println("<h2>Welcome to your page, " + username + "</h2>");
                writer.println(Utils.userPage);
            } finally {
                writer.close();
            }
        } else {
            try {
                writer.println("<h2>Error! Incorrect Login or password! Please, try again</h2>");
                writer.println(Utils.mainPage);
            } finally {
                writer.close();
            }


        }
    }

}
