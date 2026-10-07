package com.aircraftmanagement.model;

public class PrivateAircraft extends Aircraft
{
    private String additionalProperties;
    private String ownerName;
    private String luxuryLevel;

    public PrivateAircraft(String aircraftId, String Model, String manufacturer, int capacity, String status, String additionalProperties,String ownerName,String luxuryLevel) {
        super(aircraftId, Model, manufacturer, capacity, status);
        this.additionalProperties = additionalProperties;
        this.ownerName=ownerName;
        this.luxuryLevel=luxuryLevel;
    }

    public String getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(String additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getLuxuryLevel() {
        return luxuryLevel;
    }

    public void setLuxuryLevel(String luxuryLevel) {
        this.luxuryLevel = luxuryLevel;
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
        System.out.println("Owner name : "+ownerName);
        System.out.println("luxury Level : "+luxuryLevel);

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
        return "Private Type";
    }
}
