package com.designpatterns.base;

import com.designpatterns.BikeColor;

public class CrossCountry extends MountainBike {

    public CrossCountry(WheelInterface wheel){
        this(wheel, BikeColor.ORANGE);
    }

    public CrossCountry(WheelInterface wheel, BikeColor color){
        super(wheel, color);
    }
    //The following method is for the Decorator Pattern
    public float getPrice(){
        return 850.00f;
    }
}
