package com.cr1stal423.pattern.AbstractFactory.samsung;

import com.cr1stal423.pattern.AbstractFactory.Laptope;

public class SamsungLaptop implements Laptope {

    @Override
    public void createLaptop() {
        System.out.println("samsung laptop created");
    }
}
