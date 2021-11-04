package com.kodilla.good.patterns.exsersise;


// serwis do wypozyczania samochodow

import java.time.LocalDateTime;

public class CarRentalService implements RentalService{

    // wypozyczanie

    public boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
        System.out.println("Renting Car for: " + user.getFirstName() + user.getLastName()
                + " from: " + carRentFrom.toString() + " to: " + carRentTo.toString());

//            MailService mailService = new MailService();
//            mailService.sendEmail(user);
//
//            CarRentalRepository carRentalRepository = new CarRentalRepository();
//            carRentalRepository.createCarRental(user, carRentFrom, carRentTo);

        return true;
    }
}


