package com.designpatterns.behavioral.visitor;

import com.designpatterns.base.WheelInterface;

public interface WheelVisitorInterface {
    public void visit(WheelInterface wheel);
    public void visit(Spokes spokes);
    public void visit(Bearings bearings);
}
