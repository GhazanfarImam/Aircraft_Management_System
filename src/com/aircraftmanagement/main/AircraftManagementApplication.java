package com.aircraftmanagement.main;

import com.aircraftmanagement.model.*;
import com.aircraftmanagement.service.*;

import java.util.Scanner;

public class AircraftManagementApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AirCraftManager aircraftService = new AirCraftManager();
        PilotService pilotService = new PilotService();
        FlightService flightService = new FlightService();

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("      AIRCRAFT MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add Aircraft");
            System.out.println("2. Display All Aircraft");
            System.out.println("3. Find Aircraft");
            System.out.println("4. Add Pilot");
            System.out.println("5. Display All Pilots");
            System.out.println("6. Find Pilot");
            System.out.println("7. Add Flight");
            System.out.println("8. Display All Flights");
            System.out.println("9. Assign Pilot");
            System.out.println("10. Assign Aircraft");
            System.out.println("0. Exit");
            System.out.println("======================================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("\n===== ADD AIRCRAFT =====");
                    System.out.println("1. Cargo Aircraft");
                    System.out.println("2. Passenger Aircraft");
                    System.out.println("3. Private Aircraft");

                    System.out.print("Select aircraft type: ");
                    int aircraftType = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Aircraft ID: ");
                    String aircraftId = scanner.nextLine();

                    System.out.print("Enter Model: ");
                    String model = scanner.nextLine();

                    System.out.print("Enter Manufacturer: ");
                    String manufacturer = scanner.nextLine();

                    if (aircraftType == 1) {

                        System.out.print("Enter Capacity: ");
                        int capacity = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Status: ");
                        String status = scanner.nextLine();

                        System.out.print("Enter Additional Properties: ");
                        String additionalProperties = scanner.nextLine();

                        System.out.print("Enter Cargo Capacity: ");
                        int cargoCapacity = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Cargo Type: ");
                        String cargoType = scanner.nextLine();

                        CargoAircraft cargoAircraft =
                                new CargoAircraft(
                                        aircraftId,
                                        model,
                                        manufacturer,
                                        capacity,
                                        status,
                                        additionalProperties,
                                        cargoCapacity,
                                        cargoType
                                );

                        aircraftService.addAirCraft(cargoAircraft);

                    } else if (aircraftType == 2) {

                        System.out.print("Enter Capacity: ");
                        int capacity = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Status: ");
                        String status = scanner.nextLine();

                        System.out.print("Enter Number of Passengers: ");
                        int numberOfPassenger = scanner.nextInt();

                        System.out.print("Is Business Class Available? (true/false): ");
                        boolean businessclassAvailable = scanner.nextBoolean();
                        scanner.nextLine();

                        PassengerAircraft passengerAircraft =
                                new PassengerAircraft(
                                        aircraftId,
                                        model,
                                        manufacturer,
                                        capacity,
                                        status,
                                        numberOfPassenger,
                                        businessclassAvailable
                                );

                        aircraftService.addAirCraft(passengerAircraft);

                    } else if (aircraftType == 3) {

                        System.out.print("Enter Capacity: ");
                        int capacity = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Status: ");
                        String status = scanner.nextLine();

                        System.out.print("Enter Additional Properties: ");
                        String additionalProperties = scanner.nextLine();

                        System.out.print("Enter Owner Name: ");
                        String ownerName = scanner.nextLine();

                        System.out.print("Enter Luxury Level: ");
                        String luxuryLevel = scanner.nextLine();

                        PrivateAircraft privateAircraft =
                                new PrivateAircraft(
                                        aircraftId,
                                        model,
                                        manufacturer,
                                        capacity,
                                        status,
                                        additionalProperties,
                                        ownerName,
                                        luxuryLevel
                                );

                        aircraftService.addAirCraft(privateAircraft);

                    } else {

                        System.out.println("Invalid aircraft type.");

                    }

                    break;

                case 2:

                    System.out.println("\n===== ALL AIRCRAFT =====");
                    aircraftService.displayAllAircraft();

                    break;
                    

                case 3:

                    System.out.println("\n===== FIND AIRCRAFT =====");

                    System.out.print("Enter Aircraft ID: ");
                    String searchAircraftId = scanner.nextLine();

                    try {

                        Aircraft aircraft =
                                aircraftService.findAircraft(searchAircraftId);

                        aircraft.displayDetails();

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }

                    break;

                case 4:

                    System.out.println("\n===== ADD PILOT =====");

                    System.out.print("Enter Pilot ID: ");
                    int pilotId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Pilot Name: ");
                    String pilotName = scanner.nextLine();

                    System.out.print("Enter License Number: ");
                    String licenseNumber = scanner.nextLine();

                    System.out.print("Enter Experience Years: ");
                    int experienceYears = scanner.nextInt();

                    System.out.print("Is Pilot Available? (true/false): ");
                    boolean available = scanner.nextBoolean();
                    scanner.nextLine();

                    Pilot pilot =
                            new Pilot(
                                    pilotId,
                                    pilotName,
                                    licenseNumber,
                                    experienceYears,
                                    available
                            );

                    pilotService.addPilot(pilot);

                    break;

                case 5:

                    System.out.println("\n===== ALL PILOTS =====");
                    pilotService.displayAllPilots();

                    break;

                case 6:

                    System.out.println("\n===== FIND PILOT =====");

                    System.out.print("Enter Pilot ID: ");
                    int searchPilotId = scanner.nextInt();
                    scanner.nextLine();

                    try {

                        Pilot foundPilot =
                                pilotService.findPilotById(searchPilotId);

                        foundPilot.displayDetails();

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }

                    break;

                case 7:

                    System.out.println("\n===== ADD FLIGHT =====");

                    System.out.print("Enter Flight ID: ");
                    int flightId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Flight Number: ");
                    String flightNumber = scanner.nextLine();

                    System.out.print("Enter Source: ");
                    String source = scanner.nextLine();

                    System.out.print("Enter Destination: ");
                    String destination = scanner.nextLine();

                    Flight flight =
                            new Flight(
                                    flightId,
                                    flightNumber,
                                    source,
                                    destination,
                                    null,
                                    null
                            );

                    flightService.addFlight(flight);

                    break;

                case 8:

                    System.out.println("\n===== ALL FLIGHTS =====");
                    flightService.displayAllFlights();

                    break;

                case 9:

                    System.out.println("\n===== ASSIGN PILOT =====");

                    System.out.print("Enter Flight ID: ");
                    int assignPilotFlightId = scanner.nextInt();

                    System.out.print("Enter Pilot ID: ");
                    int assignPilotId = scanner.nextInt();
                    scanner.nextLine();

                    try {

                        Flight selectedFlight =
                                flightService.findFlightById(assignPilotFlightId);

                        Pilot selectedPilot =
                                pilotService.findPilotById(assignPilotId);

                        flightService.assignPilot(
                                selectedFlight.getFlightId(),
                                selectedPilot
                        );

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }

                    break;

                case 10:

                    System.out.println("\n===== ASSIGN AIRCRAFT =====");

                    System.out.print("Enter Flight ID: ");
                    int assignAircraftFlightId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Aircraft ID: ");
                    String assignAircraftId = scanner.nextLine();

                    try {

                        Flight selectedFlight =
                                flightService.findFlightById(assignAircraftFlightId);

                        Aircraft selectedAircraft =
                                aircraftService.findAircraft(assignAircraftId);

                        flightService.assignAircraft(
                                selectedFlight.getFlightId(),
                                selectedAircraft
                        );

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }

                    break;

                case 0:

                    System.out.println("\nExiting Aircraft Management System...");
                    System.out.println("Thank you!");

                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}