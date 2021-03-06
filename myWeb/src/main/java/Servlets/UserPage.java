package Servlets;

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

        User currentUser = (User) req.getSession().getAttribute("currentUser");
        if (currentUser == null) {
            resp.sendRedirect("/myWeb_war/main");
        } else if (currentUser.getLogin().equals("admin")) {
            req.getRequestDispatcher("/jsp/adminPage.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/jsp/userPage.jsp").forward(req, resp);
        }

    }
}
