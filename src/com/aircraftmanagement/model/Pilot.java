package com.aircraftmanagement.model;

public class Pilot
{
    private  int pilotId;
    private String name;
    private String licenseNumbeer;
    private int experience;
    private boolean available;

    public Pilot(int pilotId,String name,String licenseNumbeer,int experience,boolean available) {
        this.pilotId = pilotId;
        this.name=name;
        this.licenseNumbeer=licenseNumbeer;
        this.experience=experience;
        this.available=available;
    }

    public int getPilotId() {
        return pilotId;
    }

    public void setPilotId(int pilotId) {
        this.pilotId = pilotId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumbeer() {
        return licenseNumbeer;
    }

    public void setLicenseNumbeer(String licenseNumbeer) {
        this.licenseNumbeer = licenseNumbeer;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public  void displayDetails()
    {
        System.out.println("Pilot Id : "+pilotId);
        System.out.println("Name : "+name);
        System.out.println("Licence Number : "+licenseNumbeer);
        System.out.println("Experience : "+experience);
        System.out.println("Avability : "+available);
    }
}
