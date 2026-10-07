package com.aircraftmanagement.service;

import com.aircraftmanagement.model.Pilot;
import com.aircraftmanagement.exception.PilotNotFoundException;

import java.util.Scanner;

public class PilotService
{
    private Pilot[] pilotList=new Pilot[10];
    private int count=0;

    public void addPilot(Pilot pilot)
    {
        if(count<pilotList.length)
        {
            pilotList[count]=pilot;
            count++;
            System.out.println("Pilot added");
        }
        else {
            System.out.println("Pilot list is full");
        }

    }


    public Pilot findPilotById(int pilotId)
    {
        for(Pilot pilot:pilotList)
        {
            if(pilot != null && pilot.getPilotId()==pilotId)
            {
                return pilot;
            }
        }

        throw new PilotNotFoundException(
                "Pilot with Id "+pilotId +"not found"
        );
    }

    public void displayAllPilots()
    {
        for(Pilot pilot:pilotList)
        {
            pilot.displayDetails();
            System.out.println("......................................................................");
        }
    }

    public void addPilot(Scanner sc) {
    }

    public void findPilotById(Scanner sc) {
    }
}
