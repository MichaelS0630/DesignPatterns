package com.designpatterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class GearBox implements Observer {
    public void update(Observable obs, Object arg) {
        Speedometer speedo = (Speedometer) obs;
        if (speedo.getCurrentSpeed() <= 5) {
            System.out.println("Now in easy Gear");
        } else if (speedo.getCurrentSpeed() <= 10) {
            System.out.println("Now in 2nd Gear");
        } else if (speedo.getCurrentSpeed() <= 20) {
            System.out.println("Now in 3rd Gear");
        } else if (speedo.getCurrentSpeed() <= 25) {
            System.out.println("Now in 4th Gear");
        } else if (speedo.getCurrentSpeed() <= 30) {
            System.out.println("Now in 5th Gear");
        }
    }
}
