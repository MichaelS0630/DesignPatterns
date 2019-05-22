package com.designpatterns.base;

import com.designpatterns.BikeColor;

public class Vintage extends RoadBike{
    public Vintage(WheelInterface wheel){
        this(wheel, BikeColor.RED);
    }
    public Vintage(WheelInterface wheel, BikeColor color){
        super(wheel, color);
    }
    //The Following  method is for the Decorator Pattern
    public float getPrice(){
        return 600.00f;
    }
}
