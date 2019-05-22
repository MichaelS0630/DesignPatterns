package com.designpatterns.creational.abstractfactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractBikeFactory factory = new RoadBikeFactory();
        BikeFrameInterface frame = factory.createFrame();
        BikeSeatInterface seat = factory.createSeat();
        System.out.println(frame.getFrameParts());
        System.out.println(seat.getSeatParts());
    }
}
