package com.example.lib2;

import com.example.lib2.controller.CreditCardAlgorithm;
import com.example.lib2.controller.PaypalAlgorithm;
import com.example.lib2.controller.ShoppingCart;
import com.example.lib2.model.Product;

public class StrategyDesignPattern2 {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirt = new Product("986", 15);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        //payment decisions
        cart.pay(new PaypalAlgorithm("me@me.com", "now"));

        cart.pay(new CreditCardAlgorithm("Robin", "232424324"));
    }
}