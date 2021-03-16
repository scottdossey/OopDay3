package com.tts.vehicledemo;

public class RallyCar implements Vehicle
{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear)
    { 
        if((newGear < 1) || (newGear > 5))
        {
            System.out.println("Rally car only has 2 gears.");
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
    
    public void showStatus() 
    {
        System.out.println("Rally car speed: " + speed 
                          + " gear: " + gear);
    }
}
