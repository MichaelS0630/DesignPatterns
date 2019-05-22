package com.designpatterns.structural.decorator;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.NarrowWheel;
import com.designpatterns.base.Touring;

public class DecoratorMain {
    public static void main(String[] args) {
        BikeInterface myTourBike = new Touring(new NarrowWheel(24));
        System.out.println(myTourBike);
        myTourBike = new GoldFrameOption(myTourBike);
        System.out.println(myTourBike);
        myTourBike = new CustomGripsOption(myTourBike);
        System.out.println(myTourBike);
    }
}
