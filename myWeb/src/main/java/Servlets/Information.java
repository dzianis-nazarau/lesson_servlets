package Servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/information")
public class Information extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = (User) req.getSession().getAttribute("currentUser");

        req.setAttribute("username", user.getUsername());
        req.setAttribute("userage", user.getUserAge());
        req.setAttribute("usergender", user.getGender());
        req.setAttribute("usercountry", user.getCountry());

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/information.jsp");
        requestDispatcher.forward(req, resp);
    }
}
