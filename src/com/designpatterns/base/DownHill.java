package com.designpatterns.base;

import com.designpatterns.BikeColor;

public class DownHill extends MountainBike{
    public DownHill(WheelInterface wheel){
        this(wheel, BikeColor.GREEN);
    }
    public DownHill(WheelInterface wheel, BikeColor color){
        super(wheel, color);
    }
    //The Following Method is for the Decorator Pattern
    public float getPrice(){
        return 870.00f;
    }
}
