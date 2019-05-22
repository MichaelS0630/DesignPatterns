package com.designpatterns.creational.builder;

import com.designpatterns.base.BikeInterface;

public abstract class BikeDirector {
    public abstract BikeInterface build(BikeBuilder builder);

}
