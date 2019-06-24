package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightImitation {

    public void findFilght(Flight flight)throws RouteNotFoundException{

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Lawica", true);
        airports.put("Okrecie", true);
        airports.put("Modlin", true);

        if (airports.containsKey(flight.getArrivalAirport()) && airports.containsKey(flight.getDepartureAirport())){
            System.out.println("Arrival airport: " + flight.getArrivalAirport());
            System.out.println("Departure Airport: " + flight.getDepartureAirport());
        }
        else{
            throw new RouteNotFoundException("No such airport");
        }

    }
}
