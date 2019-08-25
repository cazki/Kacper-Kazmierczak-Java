package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public abstract class Processor {

    public abstract Orders process();

    public List<Products> getProducts() {

        List<Products> products = new ArrayList<>();
        products.add(new Products("AA", "BB", "CC", 5, 1));
        return products;
    }
    public boolean isOrderAvailable(){
        return true;
    }
    public void supply(){
        System.out.println("Food2Door will supply you'r order");
    }
    public void confirmOrder(){
        System.out.println("Food2Door Confirm your order.");
    }
    public void sendingOrder(){
        System.out.println("Sending orders to producer.");
    }
    public void payForOrder(){
        System.out.println("Please pay for you'r order.");
    }
}