package com.designpatterns.creational.builder;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.MountainBike;

public class MountainBikeBuilder extends BikeBuilder {
    private MountainBike bikeInProgress;

    public MountainBikeBuilder(MountainBike bike){
        this.bikeInProgress = bike;
    }

    public void buildWideTires(){
        System.out.println("Building Wide Tires");
    }

    public void buildHandleBars(){
        System.out.println("Building Handle Bars");
    }

    BikeInterface getBike(){
        return bikeInProgress;
    }
}
