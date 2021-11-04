package com.kodilla.good.patterns.exersisetwo;

import java.time.LocalDateTime;

public interface RentalService {

    public boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo);
}
