package com.tts.factoryexample;

public class SalesDepartment implements Department
{

    @Override
    public String getName()
    {
        // TODO Auto-generated method stub
        return "Sales";
    }

    @Override
    public void work()
    {
        System.out.println("We are hitting the streets to sell the product!");
    }

}
