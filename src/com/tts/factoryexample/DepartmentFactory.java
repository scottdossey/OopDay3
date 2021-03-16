package com.tts.factoryexample;

public class DepartmentFactory
{
    //This is is a factory method to create a Department.
    //It makes a department object based on its parameters..
    //The caller, doesn't need to know the details of how different
    //department types are created, that is the job of the factory method.
    public static Department createDepartment(DepartmentNames name)
    {
        Department d = null;
        if (name == null)
        {
            return null;
        }
        
        switch(name)
        {
            case SERVICE:
                d = new ServiceDepartment();
                break;
            case SALES:
                d = new SalesDepartment();
                break;
            case FINANCE:
                d = new FinanceDepartment();
                break;
            default:
                //no op
        }
        return d;
    }
}
