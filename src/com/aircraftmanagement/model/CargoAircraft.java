package com.aircraftmanagement.model;

public class CargoAircraft extends Aircraft
{
    private String additionalProperties;
    private int cargoCapacity;
    private String cargoType;

    public CargoAircraft(String aircraftId, String Model, String manufacturer, int capacity, String status, String additionalProperties,int cargoCapacity,String cargoType) {
        super(aircraftId, Model, manufacturer, capacity, status);
        this.additionalProperties = additionalProperties;
        this.cargoCapacity=cargoCapacity;
        this.cargoType=cargoType;
    }

    public String getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(String additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
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
        System.out.println("Additional Properties : "+additionalProperties);
        System.out.println("Cargo capacity : "+cargoCapacity);
        System.out.println("Cargo Type : "+cargoType);

    }

    @Override
    public void start()
    {
        System.out.println("Cargo Aircraft" +getAircraftId() + " has started");
    }

    @Override
    public void stop()
    {
        System.out.println("Cargo Aircraft" +getAircraftId() + " has stopped");
    }

    @Override
    public String getAircraftType()
    {
        return "Cargo Type";
    }
}
