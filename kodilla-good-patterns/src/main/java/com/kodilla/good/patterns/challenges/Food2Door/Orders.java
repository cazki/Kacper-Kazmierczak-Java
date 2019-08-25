package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public class Orders {

    private int orderNumber;
    private String producer;
    private boolean confirm;
    private List<Products> productsOrdered;

    public Orders(int orderNumber, String producer, boolean confirm, List<Products> productsOrdered) {
        this.orderNumber = orderNumber;
        this.producer = producer;
        this.confirm = confirm;
        this.productsOrdered = productsOrdered;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getProducer() {
        return producer;
    }

    public boolean isConfirm() {
        return confirm;
    }

    public List<Products> getProductsOrdered() {
        return productsOrdered;
    }
}
