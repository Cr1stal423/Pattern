package com.cr1stal423.pattern.Visitor.model;

import com.cr1stal423.pattern.Visitor.visitor.ProductVisitor;

public class LaptopV extends ProductV {

    public LaptopV(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}

