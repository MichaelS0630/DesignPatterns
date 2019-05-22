package com.designpatterns.structural.adapter;

import com.designpatterns.base.NarrowWheel;
import com.designpatterns.base.WheelInterface;
import com.designpatterns.base.WideWheel;

import java.util.ArrayList;
import java.util.List;

public class AdapterMain {
    public static void main(String[] args) {
        UltraWheel ultraWheel = new UltraWheel(28);
        List<WheelInterface> wheels = new ArrayList<WheelInterface>();
            wheels.add(new NarrowWheel(24));
            wheels.add(new NarrowWheel(20));
            wheels.add(new NarrowWheel(24));
            wheels.add(new UltraWheelAdapter(ultraWheel));

            for(WheelInterface wheel : wheels){
                System.out.println(wheel);
            }
    }
}
