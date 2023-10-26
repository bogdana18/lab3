package org.example;

import org.example.OrderStatus;
import org.example.Product;

import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products;
    private OrderStatus status;

    public Order(int orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        this.status = OrderStatus.NEW;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public void placeOrder() {
        // Розміщення замовлення
        status = OrderStatus.PROCESSING;
    }

    public OrderStatus getOrderStatus() {
        return status;
    }

    public void setOrderStatus(OrderStatus status) {
        this.status = status;
    }
}