package com.designpatterns.structural.adapter;

public class UltraWheel {
    private int size;

    public UltraWheel(int size){
        this.size = size;
    }
    public int getWheelSize(){
        return size;
    }
    public String toString(){
        return "ULTRA WHEEL" + " (" + size +") inches";
    }
}
