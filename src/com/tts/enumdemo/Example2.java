package com.tts.enumdemo;

public class Example2
{
    public static void main(String[] args)
    {    
        VehicleClassifications classification = 
                VehicleClassifications.OFF_LEASE;
        
        System.out.println(classification.warrantyOffered());
    }
    
}
