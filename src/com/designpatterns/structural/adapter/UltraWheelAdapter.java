package com.designpatterns.structural.adapter;

import com.designpatterns.base.AbstractWheel;

public class UltraWheelAdapter extends AbstractWheel{

    public UltraWheelAdapter(UltraWheel ultraWheel){
        super(ultraWheel.getWheelSize(), false);
    }
}
