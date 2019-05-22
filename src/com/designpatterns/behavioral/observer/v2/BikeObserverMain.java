package com.designpatterns.behavioral.observer.v2;

public class BikeObserverMain {
    public static void main(String[] args) {
        BikeSpeedometer speedo = new BikeSpeedometer();
        speedo.addSpeedometerListener(new BikeSpeedMonitor());
        speedo.addSpeedometerListener(new BikeGearBox());

        //Pedal at different speeds
        speedo.setCurrentSpeed(5);
        speedo.setCurrentSpeed(10);
        speedo.setCurrentSpeed(20);
        speedo.setCurrentSpeed(30);
        speedo.setCurrentSpeed(35);
    }
}
