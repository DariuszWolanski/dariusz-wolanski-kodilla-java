package com.kodilla.good.patterns.challenges;

public class MailService implements OrderInformationService {

    @Override
    public void sendIntormation(Customer customer) {
        System.out.println("The information sent to the buyer: " + '\n' + "In this day you ordered in our shop." + '\n');
    }
}
