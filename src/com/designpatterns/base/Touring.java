package com.designpatterns.base;

import com.designpatterns.BikeColor;

public class Touring extends RoadBike {
    public Touring(WheelInterface wheel){
        this(wheel, BikeColor.BLUE);
    }
    public Touring(WheelInterface wheel, BikeColor color){
        super(wheel, color);
    }


    //The Following method is for the Decorator Pattern
    public float getPrice(){
        return 570.00f;
    }
}
