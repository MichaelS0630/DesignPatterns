package com.designpatterns.creational.builder;

import com.designpatterns.base.BikeInterface;

public class MountainBikeDirector extends BikeDirector {

    public BikeInterface build(BikeBuilder builder) {
        builder.buildHandleBars();
        builder.buildWideTires();
        return builder.getBike();
    }
}
