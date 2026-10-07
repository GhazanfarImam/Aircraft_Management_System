package com.aircraftmanagement.model;

import com.aircraftmanagement.interfaces.Maintenance;

public abstract class Aircraft implements Maintenance
{
   private String aircraftId;
   private String Model;
    private String Manufacturer;
   private int capacity;
   private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return Model;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(String aircraftId) {
        this.aircraftId = aircraftId;
    }

    public Aircraft(String aircraftId, String Model, String manufacturer, int capacity, String status) {
        this.aircraftId = aircraftId;
        this.Model=Model;
        this.Manufacturer=manufacturer;
        this.capacity=capacity;
        this.status=status;

    }

    public abstract void displayDetails();

    public abstract void start();

    public abstract void stop();

    public abstract String getAircraftType();

    public void validateCapacity()
    {
        if(capacity <=0)
        {
            System.out.println("capacity must be greater then 0");
        }
    }

    @Override
    public void performMaintenance()
    {
        System.out.println("Maintainance have been performed");
    }

    @Override
    public void scheduleMaintenance()
    {
        System.out.println("Maintainance have been schedule");
    }
}
