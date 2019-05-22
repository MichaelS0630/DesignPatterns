package com.designpatterns.structural.facade;

import com.designpatterns.base.DownHill;
import com.designpatterns.base.WideWheel;

public class FacadeMain {
    public static void main(String[] args) {
        BikeFacade facade = new BikeFacade();
        facade.prepareForSale(new DownHill(new WideWheel(24)));
    }
}
