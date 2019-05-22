package com.designpatterns.base;

import com.designpatterns.BikeColor;

public interface BikeInterface {
    WheelInterface getWheel();
    BikeColor getColor();
    void paint(BikeColor color);

     //code below used in Decoration Pattern
    float getPrice();

    //code below used in the Facade Pattern
    void cleanFrame();
    void airTires();
    void testRide();

}
