package com.tts.factoryexample;

public class Main
{
    public static void main(String[] args)
    {
        Department myDepartment = 
                DepartmentFactory.createDepartment(DepartmentNames.SALES);
        myDepartment.work();
        
        
    }
    
    

}
