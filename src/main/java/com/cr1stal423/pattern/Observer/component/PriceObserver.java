package com.cr1stal423.pattern.Observer.component;

import org.springframework.stereotype.Component;

@Component
public class PriceObserver implements Observer {
    @Override
    public void update(String productName, double price, int quantity) {
        System.out.println("Price Update: Product '" + productName + "' now costs: $" + price);
    }
}