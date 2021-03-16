package com.tts.vehicledemo;

public class Demo
{
    public static void main(String[] args)
    {
        Motorcycle motorcycle = new Motorcycle();
        
        motorcycle.changeGear(2);
        motorcycle.accelerate(15);
        motorcycle.brake(1);

        System.out.println("Motorcycle display status :");
        motorcycle.displayStatus();
        
        RallyCar rallyCar = new RallyCar();
        rallyCar.changeGear(3);;
        rallyCar.accelerate(12);
        rallyCar.brake(2);
        
        System.out.println("RallyCar display status :");
        rallyCar.showStatus();                
    }
}
