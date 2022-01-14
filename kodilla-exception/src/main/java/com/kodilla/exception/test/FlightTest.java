package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightTest {

    public boolean findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> findFlightMap = new HashMap<>();
        findFlightMap.put("Warsaw", true);
        findFlightMap.put("Cracow", false);
        findFlightMap.put("Gdansk", true);
        findFlightMap.put("Berlin", false);
        findFlightMap.put("Paris", true);

        boolean infoFlightArrivar = false;

        for (Map.Entry<String, Boolean> findAirport : findFlightMap.entrySet()) {
            if (flight.getArrivalAirport().equals(findAirport.getKey())) {
                System.out.println("From " + flight.getArrivalAirport() + " airport you can fly on");
                return infoFlightArrivar = true;
            } else {
                throw new RouteNotFoundException();

            }
        }
        return infoFlightArrivar;
    }
}
