package com.aircraftmanagement.service;

import com.aircraftmanagement.model.Aircraft;
import com.aircraftmanagement.exception.AirCraftNotFoundException;

import java.util.Scanner;


public class AirCraftManager
{
    private Aircraft[] aircraftlist= new Aircraft[10];
    private int count=0;

    public  void addAirCraft(Aircraft aircraft)
    {
        if(count<aircraftlist.length)
        {
            aircraftlist[count]=aircraft;
            count++;

            System.out.println("AirCraft added sucessfully");
        }
        else {
            System.out.println("Aircraft list is full");
        }
    }

    public Aircraft findAircraft(String aircraftId)
    {
        for(int i=0;i<count;i++)
        {
            if(aircraftlist[i].getAircraftId().equals(aircraftId))
            {
                return aircraftlist[i];
            }
        }
        throw new AirCraftNotFoundException("Aircraft with ID" +aircraftId + "not found");
    }

    public void displayAllAircraft()
    {
        for(Aircraft aircraft:aircraftlist)
        {
            if(aircraft != null)
            {
                aircraft.displayDetails();
                System.out.println(".........................................................");
            }
        }
    }

    public void removeAirCraft(String aircraftId)
    {
        for(int i=0;i<count;i++)
        {
            if(aircraftlist[i].getAircraftId().equals(aircraftId))
            {
                for(int j=i;j<count-1;j++)
                {
                    aircraftlist[j]=aircraftlist[j+1];

                }

                aircraftlist[count-1]=null;
                count--;
                System.out.println("Aircraft removed sucessfully");
                return;
            }
        }

        throw new AirCraftNotFoundException(" Aircraft with Id "+aircraftId+" not found");
    }


}
