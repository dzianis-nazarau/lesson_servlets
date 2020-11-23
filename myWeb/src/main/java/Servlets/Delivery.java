package Servlets;

import purchase.Item;
import purchase.Order;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/delivery")
public class Delivery extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/shopForm.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = (User) req.getSession().getAttribute("currentUser");
        String delivery = req.getParameter("delivery");
        StringBuilder builder = new StringBuilder("");

        Order order = new Order();

        for(Item item : user.getBasket()) {
            builder.append("\n").append(item.getName()).append("-").append(item.getCount()).append(";");
        }

        order.setDetails(builder.toString());
        order.setDate(LocalDateTime.now());
        order.setDelivery(delivery);

        user.addOrder(order);
        user.getBasket().clear();

        resp.sendRedirect("/myWeb_war/userPage");

    }
}
