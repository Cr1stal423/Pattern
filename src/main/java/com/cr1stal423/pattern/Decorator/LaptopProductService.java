package com.cr1stal423.pattern.Decorator;

import org.springframework.stereotype.Service;

@Service
public class LaptopProductService implements IProductService {
    @Override
    public void manufactureProduct() {
        System.out.println("Manufacturing Laptop...");
    }
}
