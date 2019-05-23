package com.kodilla.testing.calculator;

import org.jetbrains.annotations.Contract;

public class Calculator {
    public int numberA;
    public int numberB;
    @Contract(pure = true)
    public Calculator(int numberA, int numberB){
        this.numberA = numberA;
        this.numberB = numberB;
    }
    public int getNumberA(){
        return numberA;
    }
    public int getNumberB(){
        return numberB;
    }
    public void sum(){
        int sumAB = numberA + numberB;
        System.out.println(numberA + " + " + numberB + " = " + sumAB);
        System.out.println("It works!");
    }
    public void(){
        int subtractAB = numberA - numberB;
        System.out.println(numberA + " - " + numberB + " = " + subtractAB);
        System.out.println("It works!");
    }
}