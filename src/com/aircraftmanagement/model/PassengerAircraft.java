package com.aircraftmanagement.model;

public class PassengerAircraft extends Aircraft
{
    private int numberOfPassenger;
    private boolean businessclassAvailable;

    public PassengerAircraft(String aircraftId, String Model, String manufacturer, int capacity, String status, int numberOfPassenger, boolean businessclassAvailable) {
        super(aircraftId, Model, manufacturer, capacity, status);
        this.numberOfPassenger = numberOfPassenger;
        this.businessclassAvailable = businessclassAvailable;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public boolean isBusinessclassAvailable() {
        return businessclassAvailable;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public void setBusinessclassAvailable(boolean businessclassAvailable) {
        this.businessclassAvailable = businessclassAvailable;
    }


    @Override
    public void displayDetails()
    {
        System.out.println("Aircraft Type : "+getAircraftType());
        System.out.println("Aircraft Id : "+getAircraftId());
        System.out.println("Model : "+getModel());
        System.out.println("manufacturer : "+getManufacturer());
        System.out.println("Capacity : "+getCapacity());
        System.out.println("Status : "+getStatus());
        System.out.println("Number of Passenger : "+numberOfPassenger);
        System.out.println("Buisness Class : "+businessclassAvailable);
    }

    @Override
    public void start()
    {
        System.out.println("Passenger Aircraft" +getAircraftId() + " has started");
    }

    @Override
    public void stop()
    {
        System.out.println("Passenger Aircraft" +getAircraftId() + " has stopped");
    }

    @Override
    public String getAircraftType()
    {
        return "Passenger Type";
    }


}
