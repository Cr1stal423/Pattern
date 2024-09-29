package com.cr1stal423.pattern.Objectpool;

import org.springframework.stereotype.Component;

@Component
public class ProductFactory {
    private int productCounter = 1;

    public Product createProduct(String name, int quantity) {
        return new Product(productCounter++, name, quantity);
    }
}
