package com.example.decoratordesign.model;

import com.example.decoratordesign.interfaces.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {

    }
    @Override
    public double cost() {
        return 0;
    }
}
