package com.designpatterns.behavioral.visitor;

import com.designpatterns.base.WheelInterface;

public class WheelInventory implements WheelVisitorInterface{
    private int spokesCount;
    private int bearingsCount;

    public WheelInventory(){
        spokesCount = 30;
        bearingsCount = 2;
    }

    public void visit(WheelInterface wheel) {
        System.out.println("The wheel has: " + spokesCount + "spokes and " + bearingsCount + "bearings");
    }
        public void visit(Spokes spokes){
            spokesCount++;
        }

        public void visit(Bearings bearings){
            bearingsCount++;
        }
    }

