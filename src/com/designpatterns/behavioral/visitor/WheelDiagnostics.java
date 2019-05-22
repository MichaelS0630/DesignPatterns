package com.designpatterns.behavioral.visitor;

import com.designpatterns.base.WheelInterface;

public class WheelDiagnostics implements WheelVisitorInterface {
    public void visit(WheelInterface wheel) {
        System.out.println("Diagnosing Bike Wheels");
    }

    public void visit (Spokes spokes){
        System.out.println("Diagnosing Wheel Spokes");
    }

    public void visit (Bearings bearings){
        System.out.println("Diagnosing Wheel Bearings");
    }

}
