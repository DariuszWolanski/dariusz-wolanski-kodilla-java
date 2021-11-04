package com.kodilla.good.patterns.exersisetwo;

public class MailService implements InformationService {

    public void sendEmail(User user){
        System.out.println("The vehicle was rented " + user);
    }
}
