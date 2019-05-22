package com.designpatterns.structural.decorator;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.AbstractBike;

public class AbstractBikeOption extends AbstractBike {
    protected BikeInterface decoratedBike;

    public AbstractBikeOption(BikeInterface bike){
        super(bike.getWheel());
        this.decoratedBike = bike;
    }

}
