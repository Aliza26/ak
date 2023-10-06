package com.akriti;


import com.akriti.vo.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Car c = new Car();
        c.setCarId(1);  
        c.setColor("green");
        c.setPrice(34.9);
        
        
        
    }
}
