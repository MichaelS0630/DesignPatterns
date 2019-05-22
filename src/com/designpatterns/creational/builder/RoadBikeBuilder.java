package com.designpatterns.creational.builder;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.RoadBike;

public class RoadBikeBuilder extends BikeBuilder {

    private RoadBike bikeInProgress;

    public RoadBikeBuilder(RoadBike bike){
        this.bikeInProgress = bike;
    }

    BikeInterface getBike(){
        return bikeInProgress;
    }

    public void buildStreetTires(){
        System.out.println("Building Street Tires");
    }

    public void buildHandleBars(){
        System.out.println("Building Handle Bars");
    }
}
