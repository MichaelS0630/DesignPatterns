package com.designpatterns.base;

import com.designpatterns.behavioral.visitor.VisitableInterface;

//The extends for this interface is used in the visitor pattern

public interface WheelInterface extends VisitableInterface {
    int getSize();
    boolean isWide();
}
