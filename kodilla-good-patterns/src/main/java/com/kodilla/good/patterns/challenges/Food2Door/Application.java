package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {

        ExampleSupplier exampleSupplier = new ExampleSupplier();
        exampleSupplier.process();

        System.out.println();

        DifferentExampleSupplier differentExampleSupplier = new DifferentExampleSupplier();
        differentExampleSupplier.process();
    }
}
