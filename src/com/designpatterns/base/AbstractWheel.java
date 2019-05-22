package com.designpatterns.base;

import com.designpatterns.behavioral.visitor.Bearings;
import com.designpatterns.behavioral.visitor.Spokes;
import com.designpatterns.behavioral.visitor.WheelVisitorInterface;

public class AbstractWheel implements WheelInterface {
    private int size;
    private boolean wide;

    //part of Visitor Pattern
    private Spokes spokes;
    private Bearings bearings;

    public AbstractWheel(int size, boolean wide) {
        this.size = size;
        this.wide = wide;

        //part of the Visitor Pattern
        spokes = new Spokes();
        bearings = new Bearings();
    }
    public int getSize(){
        return size;
    }
    public boolean isWide(){
        return wide;
    }
    //part of the Visitor Pattern
    public void acceptVisitor(WheelVisitorInterface visitor){
        spokes.acceptVisitor(visitor);
        bearings.acceptVisitor(visitor);
        visitor.visit(this);
    }
    public String toString(){
        return getClass().getSimpleName() + " at " + size + " inches";
    }
}
