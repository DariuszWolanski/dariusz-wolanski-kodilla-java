package com.kodilla.good.patterns.exsersise;

// serwis wypożyczania samochodów

import java.time.LocalDateTime;

public interface RentalService {

    boolean rent(User user, LocalDateTime from, LocalDateTime to);
}
