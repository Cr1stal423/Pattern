package com.cr1stal423.pattern.Flyweight.service;

import com.cr1stal423.pattern.Flyweight.flyweight.ProductFactory;
import com.cr1stal423.pattern.Flyweight.flyweight.ProductFlyweight;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    public void sellProduct(String name, String category, double price, int quantity) {
        ProductFlyweight product = ProductFactory.getProduct(name, category, price);
        product.sellProduct(quantity);
    }
}