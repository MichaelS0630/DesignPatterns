package com.designpatterns.base;

import com.designpatterns.BikeColor;

public class MountainBike extends AbstractBike {
    protected MountainBike(WheelInterface wheel){
        this(wheel, BikeColor.CHROME);
    }
    protected MountainBike(WheelInterface wheel, BikeColor color){
        super(wheel, color);
    }
}
