package com.designpatterns.base;

import com.designpatterns.BikeColor;

public abstract class RoadBike extends AbstractBike {

    protected RoadBike(WheelInterface wheel)
         {this(wheel, BikeColor.BLACK);}

    protected RoadBike(WheelInterface wheel, BikeColor color)
        {super(wheel, color);
    }
}
