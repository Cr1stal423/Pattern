package com.cr1stal423.pattern.Facade.service;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public void shipProduct(String productName) {
        System.out.println("Shipping initiated for product: " + productName);
    }
}
