package com.kodilla.good.patterns.exsersise;

//// serwis zajmujący się zapisywaniem informacji do bazy danych

import java.time.LocalDateTime;

public interface RentalRepository {

    boolean createRental(User user, LocalDateTime from, LocalDateTime to);

}
