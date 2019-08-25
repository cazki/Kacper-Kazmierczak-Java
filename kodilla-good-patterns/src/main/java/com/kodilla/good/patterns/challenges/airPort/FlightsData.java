package com.kodilla.good.patterns.challenges.airPort;

import java.util.ArrayList;
import java.util.List;

public class FlightsData {

    private final List<Flights> flights;

    public FlightsData(){
        this.flights = new ArrayList<>();

        flights.add(new Flights("Warsaw", "Berlin", "Poznan"));
        flights.add(new Flights("New York", "Moskwa", "Paris"));
    }
    public List<Flights> getFlights() {
        return flights;
    }
}
