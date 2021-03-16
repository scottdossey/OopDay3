package com.tts.vehicledemo;

public interface Vehicle
{
    void changeGear(int newGear);
    
    void accelerate(int increment);
    
    void brake(int decrement);
}
