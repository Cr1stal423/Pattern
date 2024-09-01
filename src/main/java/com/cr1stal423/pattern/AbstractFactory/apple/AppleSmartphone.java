package com.cr1stal423.pattern.AbstractFactory.apple;

import com.cr1stal423.pattern.AbstractFactory.Smartphone;

public class AppleSmartphone implements Smartphone {
    @Override
    public void createSmartphone() {
        System.out.println("Apple smartphone created");
    }
}
