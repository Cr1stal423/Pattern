package com.cr1stal423.pattern.AbstractFactory.samsung;

import com.cr1stal423.pattern.AbstractFactory.*;

public class SamsungFactory implements ProductFactory {
    @Override
    public Smartphone createSmartphone() {
        return new SamsungSmartphone();
    }

    @Override
    public Laptope createLaptop() {
        return new SamsungLaptop();
    }
}
