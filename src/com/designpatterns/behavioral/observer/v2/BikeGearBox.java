package com.designpatterns.behavioral.observer.v2;

public class BikeGearBox implements SpeedometerListener {

    public void speedChange(SpeedometerEvent event){
        if(event.getSpeed() <= 5){
            System.out.println("Now in easy Gear");
        } else if (event.getSpeed() <= 10){
            System.out.println("Now in 2nd Gear");
        } else if (event.getSpeed() <= 20){
            System.out.println("Now in 3rd Gear");
        } else if (event.getSpeed() <= 25){
            System.out.println("Now in 4th Gear");
        }else if (event.getSpeed() <= 30){
            System.out.println("Now in 5th Gear");
        }

    }
}
