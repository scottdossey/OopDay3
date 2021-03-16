package com.tts.vehicledemo;

public class Motorcycle implements Vehicle
{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear)
    {
        if((newGear < 1) || (newGear > 2))
        {
            System.out.println("Motorcycle only has 2 gears.");
        }
        gear = newGear;
    }

    @Override
    public void accelerate(int increment)
    {
        speed = speed + increment;
    }

    @Override
    public void brake(int decrement)
    {
        speed = speed - decrement;        
    }
    
    public void displayStatus() 
    {
        System.out.println("Motorcycle speed: " + speed 
                          + " gear: " + gear);
    }

}
