package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;
import java.util.Arrays;

public class ProductOrderServiceRunner {
    public static void main(String[] args) {
        User newUser = new User("janek123");
        Product newProduct = new Product("computer mouse", new BigDecimal("50.00"));
        OrderRequest newOrder = new OrderRequest(newUser, Arrays.asList(newProduct));

        InformationService newInformationSer = new InformationService();
        OrderRepository newOrderRep = new OrderRepository();
        newOrderRep.addProduct(newProduct);
        OrderService newOrderSer = new OrderService(newOrderRep);


        ProductOrderService service = new ProductOrderService(newInformationSer, newOrderSer, newOrderRep);
        OrderDto newOrderDto = service.process(newOrder);
        System.out.println(newOrderDto);

    }
}
