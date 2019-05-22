package com.designpatterns.base;

import com.designpatterns.BikeColor;

public class AbstractBike implements BikeInterface {
    private WheelInterface wheel;
    private BikeColor color;

    protected AbstractBike(WheelInterface wheel){
        this(wheel, BikeColor.UNPAINTED);
    }
    protected AbstractBike(WheelInterface wheel, BikeColor color){
        this.wheel = wheel;
        this.color = color;
    }

    @Override
    public WheelInterface getWheel() {return wheel;}

    @Override
    public BikeColor getColor() {return color;}

    public void paint(BikeColor color) {this.color = color;}

    //The following Method is for the Decoration Pattern
    public float getPrice(){return 900.000f;}

    public String toString(){
        return getClass().getSimpleName()+ " (" +wheel+ ", "+color+ ", price =" + getPrice() + ")";
    }
    //The code below is part of the Facade Pattern
    public void cleanFrame(){
        System.out.println("Cleaning Frame.....");
    }
    public void airTires(){
        System.out.println("Airing Tires.....");
    }
    public void testRide(){
        System.out.println("Taking nike out for a test......");
    }

}
