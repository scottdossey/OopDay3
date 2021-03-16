package com.tts.enumdemo;

public class EnumTestHardWay
{
    DayHardWay day;

    public EnumTestHardWay(DayHardWay day) 
    {
        this.day = day;
    }
    
    public void weekendOrWeekday()
    {
        switch (day.day) //Use the value inside day.
        {
            case DayHardWay.SATURDAY:
            case DayHardWay.SUNDAY:
                System.out.println("It's a weekend!");
                break;
             default:
                System.out.println("It's a weekday!");
                break;    
        }
    }
    
    public static void main(String[] args)
    {
        EnumTestHardWay weekday = new EnumTestHardWay(new DayHardWay(DayHardWay.MONDAY));
        weekday.weekendOrWeekday();
        
        EnumTestHardWay weekend = new EnumTestHardWay(new DayHardWay(DayHardWay.SATURDAY));
        weekend.weekendOrWeekday();
    }
}
