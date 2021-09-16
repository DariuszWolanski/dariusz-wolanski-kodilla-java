package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightTest {

    public String findFilght(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> findFlightMap = new HashMap<>();
        findFlightMap.put("Warsaw", true);
        findFlightMap.put("Cracow", false);
        findFlightMap.put("Gdansk", true);
        findFlightMap.put("Berlin", false);
        findFlightMap.put("Paris", true);

        for (Map.Entry<String, Boolean> findAitport : findFlightMap.entrySet()) {
            if(flight.getArrivalAirport() == findAitport.getKey()){
                System.out.println("From " + flight.getArrivalAirport() + " airport you can fly on");
            }else {
                throw new RouteNotFoundException();
            }

        }

        return "";
    }
}
