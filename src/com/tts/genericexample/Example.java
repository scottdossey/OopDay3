package com.tts.genericexample;

import java.util.ArrayList;
import java.util.List;

public class Example
{
    public static void main(String[] args)
    {
        Wrapper<Integer> myWrapper = new Wrapper<>();
        myWrapper.setValue(4);
        System.out.println(myWrapper.getValue());
        
        Wrapper<String> wrapper2 = new Wrapper<>();
        wrapper2.setValue("Hello");
        System.out.println(wrapper2.getValue());
        
    }
    
    static <T> void exampleMethod(T value)
    {
        
    }
}
