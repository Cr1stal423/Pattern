package com.cr1stal423.pattern.Observer.component;

import org.springframework.stereotype.Component;

@Component
public class StockObserver implements Observer {
    @Override
    public void update(String productName, double price, int quantity) {
        System.out.println("Stock Update: Product '" + productName + "' now has quantity: " + quantity);
    }
}