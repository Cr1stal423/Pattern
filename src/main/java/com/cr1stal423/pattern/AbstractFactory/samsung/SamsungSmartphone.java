package com.cr1stal423.pattern.AbstractFactory.samsung;

import com.cr1stal423.pattern.AbstractFactory.Smartphone;

public class SamsungSmartphone implements Smartphone {
    @Override
    public void createSmartphone() {
        System.out.println("samsung smartphone created");
    }
}
