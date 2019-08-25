package com.kodilla.good.patterns.challenges.Food2Door;

public class ExampleSupplier extends Processor {

    public final String name = "ExampleSupplier";

    @Override
    public Orders process() {
        getProducts();
        if (isOrderAvailable()) {
            System.out.println(name);
            payForOrder();
            sendingOrder();
            confirmOrder();
            supply();
            return new Orders(2, name, true, getProducts());
        }
        else{
            System.out.println("Sorry, but we can't realise you'r order :(");
            return new Orders(0, name, false, getProducts());
        }
    }
}
