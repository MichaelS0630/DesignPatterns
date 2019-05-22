package com.designpatterns.structural.decorator;

import com.designpatterns.base.BikeInterface;

public class LeatherSeatOption extends AbstractBikeOption {

    LeatherSeatOption(BikeInterface bike) {super(bike);}

    public float getPrice(){
        return decoratedBike.getPrice() + 40.00f;
    }
}
