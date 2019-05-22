package com.designpatterns.creational.abstractfactory;

public abstract class AbstractBikeFactory {
    abstract BikeFrameInterface createFrame();
    abstract BikeSeatInterface createSeat();
}
