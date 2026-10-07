package com.aircraftmanagement.model;

public class Flight {
    private int flightId;
    private String flightNumber;
    private String source;
    private String destination;
    private Aircraft aircraft;
    private Pilot pilot;

    public Flight(int flightId, String flightNumber, String source,
                  String destination, Aircraft aircraft, Pilot pilot) {

        this.flightId = flightId;
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.aircraft = aircraft;
        this.pilot = pilot;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public void displayFlightDetails() {

        System.out.println("Flight ID: " + flightId);
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);

        System.out.println("\nAircraft Details:");
        aircraft.displayDetails();

        System.out.println("\nPilot Details:");
        pilot.displayDetails();
    }
}