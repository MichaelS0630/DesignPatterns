package com.designpatterns.structural.decorator;

import com.designpatterns.base.BikeInterface;

public class WhiteTireOption extends AbstractBikeOption {

    WhiteTireOption(BikeInterface bike) {super(bike);}

    public float getPrice(){
        return decoratedBike.getPrice() + 80.00f;
    }
}
