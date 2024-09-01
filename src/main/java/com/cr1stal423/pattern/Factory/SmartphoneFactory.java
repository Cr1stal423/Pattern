package com.cr1stal423.pattern.Factory;

public class SmartphoneFactory extends ProducrFactory{
    @Override
    public Product createProduct() {
        return new Smartphone();
    }
}
