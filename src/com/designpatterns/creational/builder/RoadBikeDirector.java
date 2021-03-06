package com.designpatterns.creational.builder;


import com.designpatterns.base.BikeInterface;

public class RoadBikeDirector extends BikeDirector {

    public BikeInterface build(BikeBuilder builder){
        builder.buildHandleBars();
        builder.buildStreetTires();
        return builder.getBike();
    }
}
