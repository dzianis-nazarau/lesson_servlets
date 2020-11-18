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

import static java.lang.Integer.parseInt;

@WebServlet("/store")
public class Store extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/store.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Warehouses warehouses = new Warehouses();

        int count = parseInt(req.getParameter("count"));
        String itemName = req.getParameter("item");

        Item item = warehouses.getItemInfo(itemName);
        item.setCount(item.getCount() - count);

        Item newItem = new Item(item.getName(), item.getDescription(), count);
        Helper.currentUser.addBasketItem(newItem);

        resp.sendRedirect("/myWeb_war/store");
    }
}
