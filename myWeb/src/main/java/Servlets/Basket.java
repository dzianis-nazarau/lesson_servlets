package Servlets;

import purchase.Item;
import purchase.Warehouses;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/basket")
public class Basket extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/basket.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        Warehouses warehouses = (Warehouses) req.getServletContext().getAttribute("warehouse");
        User user = (User) req.getSession().getAttribute("currentUser");

        String itemName = req.getParameter("item");
        int count = user.getItemInfo(itemName).getCount();

        user.removeBasketItem(itemName);

        Item item = warehouses.getItemInfo(itemName);
        item.setCount(item.getCount() + count);

        resp.sendRedirect("/myWeb_war/basket");
    }
}
