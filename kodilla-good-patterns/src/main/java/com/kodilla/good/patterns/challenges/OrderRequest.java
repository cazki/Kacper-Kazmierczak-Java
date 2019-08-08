package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRequest {
    private User user;
    private List <Product> products = new ArrayList<>();

    public User getUser() {
        return user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
