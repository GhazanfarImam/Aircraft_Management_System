package com.aircraftmanagement.exception;

public class PilotAlreadyAssignedException extends RuntimeException
{
    public PilotAlreadyAssignedException(String message)
    {
        super(message);
    }
}
