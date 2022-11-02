package com.example.decoratordesign.model;

import com.example.decoratordesign.interfaces.IceCream;
import com.example.decoratordesign.interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {


    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return super.cost();
    }
}
