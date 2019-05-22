package com.designpatterns.creational.abstractfactory;

public class MountainBikeFactory extends AbstractBikeFactory{
    BikeFrameInterface createFrame(){
        return new MountainFrame();
    }

    BikeSeatInterface createSeat(){
        return new MountainSeat();
    }

}
