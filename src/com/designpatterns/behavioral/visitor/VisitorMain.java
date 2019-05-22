package com.designpatterns.behavioral.visitor;

import com.designpatterns.base.WheelInterface;
import com.designpatterns.base.WideWheel;

public class VisitorMain {
    public static void main(String[] args) {
        WheelInterface wheel = new WideWheel(24);

        //Run Diagnostics
        wheel.acceptVisitor(new WheelDiagnostics());

        //Run Inventory
        wheel.acceptVisitor(new WheelInventory());
    }
}
