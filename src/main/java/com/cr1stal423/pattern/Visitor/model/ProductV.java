package com.cr1stal423.pattern.Visitor.model;

import com.cr1stal423.pattern.Visitor.visitor.ProductVisitor;

public abstract class ProductV {
    protected String name;
    protected double price;

    public ProductV(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void accept(ProductVisitor visitor);

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
