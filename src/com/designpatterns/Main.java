package com.designpatterns;

import com.designpatterns.base.NarrowWheel;
import com.designpatterns.base.RoadBike;
import com.designpatterns.base.Touring;

public class Main {

    public static void main(String[] args) {
        //Use Abstract Parent Object with Child Constructor
        RoadBike bike = new Touring(new NarrowWheel(22));
        System.out.println(bike.getColor());
    }
}
