package com.kodilla.good.patterns.challenges;

import java.util.List;

public class OrderRepository {
    public void createOrder(User user, List<Product> products) {
        if(products.isEmpty()){
            System.out.println(user + "! Your shopping cart is empty!");
        }
        else {
            System.out.println("User: " + user + " Buying products: " + products);
        }
    }
}
