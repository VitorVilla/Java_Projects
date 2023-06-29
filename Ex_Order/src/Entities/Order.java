package Entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Enums.OrderStatus;

public class Order {

    private LocalDateTime date;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> orderItems = new ArrayList<>();

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Order(LocalDateTime date, OrderStatus status, Client client) {
        this.date = date;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public double total() {
        double sum = 0;
        for (OrderItem c : orderItems) {
            sum += c.subTotal();
        }
        return sum;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: " + date.format(fmt) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() + "(" + client.getDate() + ")" + " - " + client.getEmail() + "\n");
        sb.append("Order items: \n");
        for (OrderItem c : orderItems) {
            sb.append(c.getProduct().getNome() + ", $" + c.getPrice() + " Quantity: " + c.getQuantity() + " Subtotal: "
                    + c.subTotal() + "\n");
        }
        sb.append(total());
        return sb.toString();
    }

}
