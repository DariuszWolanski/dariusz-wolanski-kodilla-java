package com.kodilla.good.patterns.exersisetwo;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {
        User user = new User("John", "Wekl");

        LocalDateTime rentFrom = LocalDateTime.of(2017, 8, 1, 12, 0);
        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);

        MailService mailService = new MailService();
        CarRentalService carRentalService = new CarRentalService();
        CarRentalRepository carRentalRepository = new CarRentalRepository();

        CarRentalProcessor rentalProcessor = new CarRentalProcessor(mailService,
                carRentalService, carRentalRepository);

        boolean isRented = carRentalService.rent(user, rentFrom, rentTo);

        if (isRented) {
            mailService.sendEmail(user);
            carRentalRepository.createCarRental(user, rentFrom, rentTo);
        } else {
            System.out.println("Car rent has been rejected!");
        }
    }
}
