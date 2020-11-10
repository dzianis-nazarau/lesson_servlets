import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/information")
public class Information extends HttpServlet {

    Helper helper = new Helper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        User user = Helper.currentUser;

        PrintWriter writer = resp.getWriter();
        try {
            writer.println("<table>\n" +
                    "  <tr>\n" +
                    "    <th>Name</th>\n" +
                    "    <th>Age</th>\n" +
                    "    <th>Gender</th>\n" +
                    "    <th>Country</th>\n" +
                    "  </tr>\n" +
                    "  <tr>\n" +
                    "    <td>" + user.getUsername() + "</td>\n" +
                    "    <td>" + user.getUserage() + "</td>\n" +
                    "    <td>" + user.getGender() + "</td>\n" +
                    "    <td>" + user.getCountry() + "</td>\n" +
                    "  </tr>\n" +
                    "</table>");
        } finally {
            writer.close();
        }
    }
}
