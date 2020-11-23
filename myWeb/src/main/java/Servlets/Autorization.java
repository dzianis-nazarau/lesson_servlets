package Servlets;

import purchase.Item;
import purchase.Warehouses;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/main")
public class Autorization extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        User user = new User();
        user.setLogin("admin");
        user.setPassword("admin123");
        user.setUsername("SuperAdmin");
        user.setUserAge("25");
        user.setGender("Male");
        user.setCountry("Belarus");
        Helper.users.add(user);

        Warehouses.storeItemsList.add(new Item("apple", "fruit", 10));
        Warehouses.storeItemsList.add(new Item("tomato", "vegetable", 5));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext = req.getServletContext();
        servletContext.setAttribute("warehouse", new Warehouses());

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/login.jsp");
        requestDispatcher.forward(req, resp);
    }
}
