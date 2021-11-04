package com.kodilla.good.patterns.exersisetwo;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {

    public void createCarRental(User user, LocalDateTime rentFrom, LocalDateTime rentTo){
        System.out.println("The vehicle was rented " + user + " from " + rentFrom + " to " + rentTo);
    }
}
