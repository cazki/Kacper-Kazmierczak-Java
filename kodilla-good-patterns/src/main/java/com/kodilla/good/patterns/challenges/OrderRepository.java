package com.kodilla.good.patterns.challenges;

import java.util.HashSet;
import java.util.Set;

public class OrderRepository {

    private Set <Product> productSet = new HashSet<>();
    public void addProduct(Product product){
        productSet.add(product);
    }
    public boolean checkProduct(Product product){
        return productSet.contains(product);
    }
}
