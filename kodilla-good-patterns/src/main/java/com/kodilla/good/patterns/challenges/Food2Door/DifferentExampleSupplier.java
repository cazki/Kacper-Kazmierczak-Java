package com.kodilla.good.patterns.challenges.Food2Door;

public class DifferentExampleSupplier extends Processor{

    public final String name = "DifferentExampleSupplier";

    @Override
    public Orders process(){

        double quantity = 1.0;
        getProducts();
        System.out.println(name);

        if(quantity <= getProducts().get(0).getQuantity()){
            payForOrder();
            sendingOrder();
            confirmOrder();
            supply();

            return new Orders(1,name,true,getProducts());
        }else {
            System.out.println("Sorry, but we can't realise you'r order :(");
            return new Orders(0, name, false, getProducts());
        }
    }


}
