package com.tts.enumdemo;

public class EnumTest
{
    public enum Day
    {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
        THURSDAY, FRIDAY, SATURDAY
    }
    
    Day day;

    public EnumTest(Day day) 
    {
        this.day = day;
    }
    
    public void weekendOrWeekday()
    {
        switch (day)
        {
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's a weekend!");
                break;
             default:
                System.out.println("It's a weekday!");
                break;    
        }
    }
    
    public static void main(String[] args)
    {
        EnumTest weekday = new EnumTest(Day.MONDAY);
        weekday.weekendOrWeekday();
        
        EnumTest weekend = new EnumTest(Day.SATURDAY);
        weekend.weekendOrWeekday();
        
        Day day=Day.MONDAY;
    }
}
