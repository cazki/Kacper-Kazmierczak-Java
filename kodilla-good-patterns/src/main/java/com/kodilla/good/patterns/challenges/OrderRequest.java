package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRequest {
    private User user;
    private List <Product> products = new ArrayList<>();

    public OrderRequest(User user, List<Product> products) {
        this.user = user;
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getProducts() {
        return products;
    }

}
