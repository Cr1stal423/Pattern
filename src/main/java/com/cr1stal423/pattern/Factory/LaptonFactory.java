package com.cr1stal423.pattern.Factory;

public class LaptonFactory extends ProducrFactory{
    @Override
    public Product createProduct() {
        return new Laptop();
    }
}
