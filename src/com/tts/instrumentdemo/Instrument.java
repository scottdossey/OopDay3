package com.tts.instrumentdemo;

//abstract class declaration
public abstract class Instrument
{
    String name;     
        
    //abstract method 
    public abstract void createSound();
    
    //concrete method
    public String getName()
    {
        return name;
    }

    //concrete method
    public void setName(String name)
    {
        this.name = name;
    }
}
