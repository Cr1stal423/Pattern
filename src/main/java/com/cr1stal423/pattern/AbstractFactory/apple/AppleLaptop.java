package com.cr1stal423.pattern.AbstractFactory.apple;

import com.cr1stal423.pattern.AbstractFactory.Laptope;

public class AppleLaptop implements Laptope {
    @Override
    public void createLaptop() {
        System.out.println("Apple laptop created");
    }
}
