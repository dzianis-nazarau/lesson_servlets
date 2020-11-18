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

        String delivery = req.getParameter("delivery");

        String orderDetails = "";
        Order order = new Order();

        for(Item item : Helper.currentUser.getBasket()) {
            orderDetails += item.toString();
        }
        order.setDetails(orderDetails);
        order.setDate(LocalDateTime.now().toString());
        order.setDelivery(delivery);

        Helper.currentUser.addOrder(order);

        Helper.currentUser.getBasket().clear();

        resp.sendRedirect("/myWeb_war/userPage");

    }
}
