package com.designpatterns.structural.decorator;

import com.designpatterns.base.BikeInterface;

public class CustomGripsOption extends AbstractBikeOption {

    CustomGripsOption(BikeInterface bike) {super(bike);}

    public float getPrice(){
        return decoratedBike.getPrice() + 20.00f;
    }

}
