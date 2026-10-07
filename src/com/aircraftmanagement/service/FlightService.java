package com.aircraftmanagement.service;
import com.aircraftmanagement.model.Flight;
import com.aircraftmanagement.exception.FlightNotFoundException;
import com.aircraftmanagement.model.Aircraft;
import com.aircraftmanagement.model.Pilot;

import java.util.Scanner;

public class FlightService
{

    private Flight[] flightList=new Flight[10];
    private int count=0;

    public void addFlight(Flight flight)
    {
        if(count<flightList.length)
        {
            flightList[count]=flight;
            count++;
            System.out.println("Flight added");
        }
        else {
            System.out.println("Fligjt is full");
        }
    }

    public Flight findFlightById(int flightId) {

        for (Flight flight : flightList) {

            if (flight != null && flight.getFlightId() == flightId) {
                return flight;
            }
        }

        System.out.println("Flight not found.");
        return null;
    }

    public void displayAllFlights() {

        for (Flight flight : flightList) {

            if (flight != null) {
                flight.displayFlightDetails();
                System.out.println("----------------------");
            }
        }
    }

    public void assignPilot(int flightId, Pilot pilot)
    {
        Flight flight=findFlightById(flightId);

        if(flight==null)
        {
            return;
        }

        if(!pilot.isAvailable())
        {
            System.out.println("PIlot is not available");
            return;
        }

        flight.setPilot(pilot);
        pilot.setAvailable(false);

        System.out.println("Pilot assigned successfully");
    }

    public void assignAircraft(int flightId, Aircraft aircraft) {

        Flight flight = findFlightById(flightId);

        if (flight == null) {
            return;
        }

        flight.setAircraft(aircraft);

        System.out.println("Aircraft assigned successfully.");
    }

    public void findFlightById(Scanner sc) {
    }

    public void scheduleFlight(Scanner sc, AirCraftManager aircraftManager, PilotService pilotManager) {
    }

    public void cancelFlight(Scanner sc) {
    }
}
