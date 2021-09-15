package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(0.9, 1.4));;
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }finally {
            System.out.println("Not as simple as it seems");
        }
    }
}
