package com.kodilla.good.patterns.exersisetwo;

public class CarRentalProcessor {

     InformationService informationService;
     RentalService rentalService;
     RentalRepository rentalRepository;

    public CarRentalProcessor(InformationService informationService,
                              RentalService rentalService, RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }
}
