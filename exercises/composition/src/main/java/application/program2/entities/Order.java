package application.program2.entities;

import application.program2.entities.enums.OrderStatus;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date createdAt;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();
    private Double total;
    private OrderStatus status;

    public Order(Client client) {
        this.createdAt = new Date();
        this.client = client;
        this.total = 0.00;
        this.status = OrderStatus.PROCESSING;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Client getClient() {
        return client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Double getTotal() {
        return total;
    }

    public OrderStatus getStatus() {
        return status;
    }

    /**
     * METHODS
     */
    public void addProduct(OrderItem orderItem) {
        items.add(orderItem);
        this.total += orderItem.subTotal();
    }

    public void removeProduct(OrderItem orderItem) {
        items.remove(orderItem);
    }

    @Override
    public String toString() {
        return "Order{" +
                "createdAt=" + createdAt +
                ", client=" + client +
                ", items=" + items +
                ", total=" + total +
                ", status=" + status +
                '}';
    }
}
