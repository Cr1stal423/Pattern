package com.cr1stal423.pattern.AbstractFactory.apple;


import com.cr1stal423.pattern.AbstractFactory.*;

public class AppleFactory implements ProductFactory {
    @Override
    public Smartphone createSmartphone() {
        return new AppleSmartphone();
    }

    @Override
    public Laptope createLaptop() {
        return new AppleLaptop();
    }
}
