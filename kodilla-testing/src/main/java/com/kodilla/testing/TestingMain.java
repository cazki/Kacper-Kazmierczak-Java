package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(1, 1);
        calculator.sum();
        calculator.subtract();
        int sumTest = numberA + numberB;
        int subtractTest = numberA - numberB;
        if (sumAB == sumTest){
             System.out.println("Adding is OK");
        }
        else{
             System.out.println("Adding is wrong!!!");
        }
        if (subtractAB == subtractTest){
            System.out.println("Subtract is OK");
        }
        else {
            System.out.println("Subtract is wrong!!!");
        }
    }
}