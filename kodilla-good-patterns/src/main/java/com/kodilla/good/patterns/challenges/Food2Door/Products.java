package com.kodilla.good.patterns.challenges.Food2Door;

public class Products {
    private String producer;
    private String category;
    private String name;
    private double price;
    private double quantity;

    public Products(String producer, String category, String name, double price, double quantity) {
        this.producer = producer;
        this.category = category;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }
}
