package com.tts.factoryexample;

public class ServiceDepartment implements Department
{

    @Override
    public String getName()
    {
        return "Service";        
    }

    @Override
    public void work()
    {
        System.out.println("We are fixing fixing fixing the product!");
    }

}
