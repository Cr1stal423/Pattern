package com.cr1stal423.pattern.Factory;

public class Laptop extends Product{
    @Override
    public void create() {
        System.out.println("Laptop created");
    }
}
