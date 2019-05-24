package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
//        SimpleUser simpleUser = new SimpleUser("theForumUser");
//
//        String result = simpleUser.getUsername();
//
//        if (result.equals("theForumUser")){
//            System.out.println("test OK");
//        }
//        else{
//            System.out.println("Error!");
//        }

        Calculator calculator = new Calculator();
        int calculatorAdd = calculator.addAB(1, 1);

        if(calculatorAdd == 2){
            System.out.println("Adding test OK");
        }
        else{
            System.out.println("Error!");
        }

        int calculatorSubstract = calculator.substractAB(1, 1);

        if(calculatorSubstract == 0){
            System.out.println("Substract test OK");
        }
        else{
            System.out.println("Error!");
        }
    }
}