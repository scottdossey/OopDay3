package com.tts.enumdemo;

public enum VehicleClassifications
{
    NEW(true, true),
    USED(false, true),
    OFF_LEASE(true, true),
    SHUTTLE(true, false),
    LOANER(false, false),
    PARTS_RUNNER(true, true);   
    
    private boolean warranty;
    private boolean freeService;
    
    private VehicleClassifications(boolean warranty, boolean freeService)
    {
        this.warranty = warranty;
        this.freeService = freeService;
    }
    
    public boolean warrantyOffered()
    {
        return warranty;
    }
    
    public boolean freeServiceOffered()
    {
        return freeService;
    }
}
