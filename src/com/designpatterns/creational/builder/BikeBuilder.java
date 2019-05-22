package com.designpatterns.creational.builder;

import com.designpatterns.base.BikeInterface;

public abstract class BikeBuilder {
    abstract BikeInterface getBike();
    public void buildStreetTires(){}
    public void buildWideTires(){}
    public void buildHandleBars(){}
}
