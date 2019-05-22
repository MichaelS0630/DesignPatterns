package com.designpatterns.structural.decorator;

import com.designpatterns.base.BikeInterface;

public class GoldFrameOption extends AbstractBikeOption {

    GoldFrameOption(BikeInterface bike) {
        super(bike);
    }

    public float getPrice(){
        return decoratedBike.getPrice() + 300.00F;
    }

    public String toString(){
        return getClass().getSimpleName() + " (" +getWheel() + ", GOLD price = " + getPrice() + ")";
    }
}
