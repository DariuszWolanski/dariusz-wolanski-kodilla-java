package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int result1 = calc.add(5, 65);
        int result2 = calc.substract(5, 65);

        if (result1 == 5 + 65){
            System.out.println("Test additions method is OK");
        } else {
            System.out.println("Error - test additions method is failed!");
        }

        if (result2 == 5 - 65){
            System.out.println("Test substract method is OK");
        } else {
            System.out.println("Error - test substract method is failed!");
        }






    }
}
