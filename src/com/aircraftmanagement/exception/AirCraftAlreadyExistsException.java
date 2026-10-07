package com.aircraftmanagement.exception;

public class AirCraftAlreadyExistsException extends RuntimeException
{
    public AirCraftAlreadyExistsException(String message)
    {
        super(message);
    }
}
