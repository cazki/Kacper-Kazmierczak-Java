package com.kodilla.exception.test;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight("Balice","Lawica");
        FlightImitation flightImitation = new FlightImitation();

        try{
            flightImitation.findFilght(flight);
        } catch(RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}