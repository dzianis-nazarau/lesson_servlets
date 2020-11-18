package Servlets;

import purchase.Item;
import purchase.Order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class User {

    private String login;
    private String password;
    private String username;
    private String userage;
    private String gender;
    private String country;
    private List<Item> basket = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void addBasketItem(Item item) {
        basket.add(item);
    }

    public void removeBasketItem(String name) {

        int index = -1;
        for (Item item: basket) {
            if (item.getName().equals(name)) {
                index = basket.indexOf(item);
            }
        }
        if (index != -1) {
            basket.remove(index);
        }
    }

    public List<Item> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Item> basket) {
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserage() {
        return userage;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Item getItemInfo(String name) {
        Optional<Item> userObject = basket.stream().
                filter(item -> item.getName().equals(name)).
                findFirst();
        //null
        Item item = userObject.get();
        return item;
    }
}
