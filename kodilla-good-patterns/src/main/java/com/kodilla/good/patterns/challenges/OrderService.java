package com.kodilla.good.patterns.challenges;

import java.util.List;

public class OrderService {
    private OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public boolean order(User user, List<Product> products) {
        int repositoryProductCount = 0;
        for(Product product : products){
            if (repository.checkProduct(product)) {
                repositoryProductCount ++;
            }
        }
        return repositoryProductCount == products.size();
    }
}
