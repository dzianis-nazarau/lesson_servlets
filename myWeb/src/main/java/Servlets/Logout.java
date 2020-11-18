package Servlets;

import purchase.Item;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/logout")
public class Logout extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Helper.currentUser = new User();
        req.getSession().setAttribute("user", null);
        Helper.currentUser.setLogin("default");
        Helper.currentUser.setPassword("2135");
        resp.sendRedirect("/myWeb_war/main");
    }
}
