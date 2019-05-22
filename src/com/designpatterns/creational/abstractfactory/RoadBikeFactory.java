package com.designpatterns.creational.abstractfactory;

public class RoadBikeFactory extends AbstractBikeFactory {

    BikeFrameInterface createFrame(){
        return new RoadFrame();
    }

    BikeSeatInterface createSeat(){
        return new RoadSeat();
    }
}
