package org.example;

import org.example.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ECommerceSystemTest {
    private Product product1;
    private Product product2;
    private Cart cart;
    private Order order;

    @Before
    public void setUp() {
        product1 = new Product(1, "Product 1", 10.0);
        product2 = new Product(2, "Product 2", 20.0);
        cart = new Cart();
        order = new Order(1, new ArrayList<>());
    }

    @Test
    public void testAddProductToCart() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        assertEquals(2, cart.getProducts().size());
    }

    @Test
    public void testRemoveProductFromCart() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.removeProduct(product1);
        assertEquals(1, cart.getProducts().size());
    }

    @Test
    public void testPlaceOrder() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        order.setProducts(cart.getProducts());
        order.placeOrder();
        assertEquals(OrderStatus.PROCESSING, order.getOrderStatus());
    }

    @Test
    public void testGetOrderStatus() {
        cart.addProduct(product1);
        order.setProducts(cart.getProducts());
        assertEquals(OrderStatus.NEW, order.getOrderStatus());
        order.placeOrder();
        assertEquals(OrderStatus.PROCESSING, order.getOrderStatus());
    }
}
