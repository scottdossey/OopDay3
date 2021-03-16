package com.tts.factoryexample;

public class FinanceDepartment implements Department
{

    @Override
    public String getName()
    {
        
        return "Finance";
    }

    @Override
    public void work()
    {
        System.out.println("We are tabulating, and investing, and accounting oh my");
    }

}
