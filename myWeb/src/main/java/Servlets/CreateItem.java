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

@WebServlet("/createItem")
public class CreateItem extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        int count = parseInt(req.getParameter("count"));

        Item item = new Item(name, description, count);
        Warehouses.storeItemsList.add(item);

        resp.sendRedirect("/myWeb_war/userPage");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/addItemToStore.jsp");
        requestDispatcher.forward(req, resp);
    }
}
