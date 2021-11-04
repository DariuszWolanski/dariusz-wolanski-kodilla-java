package com.kodilla.good.patterns.exersisetwo;

import java.time.LocalDateTime;

public interface RentalRepository {

    public void createCarRental(User user, LocalDateTime rentFrom, LocalDateTime rentTo);

}
