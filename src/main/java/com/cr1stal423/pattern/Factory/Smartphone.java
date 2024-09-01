package com.cr1stal423.pattern.Factory;

public class Smartphone extends Product{
    @Override
    public void create() {
        System.out.println("Smartphone created");
    }
}
