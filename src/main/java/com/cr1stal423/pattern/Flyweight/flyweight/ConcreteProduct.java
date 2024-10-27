package com.cr1stal423.pattern.Flyweight.flyweight;

import com.cr1stal423.pattern.Flyweight.model.ProductDetails;

public class ConcreteProduct implements ProductFlyweight {
    private final ProductDetails details;

    public ConcreteProduct(String name, String category, double price) {
        this.details = new ProductDetails(name, category, price);
    }

    @Override
    public void sellProduct(int quantity) {
        System.out.println("Selling " + quantity + " units of " + details.getName() + " in category " + details.getCategory() + ".");
    }

    @Override
    public ProductDetails getDetails() {
        return details;
    }
}