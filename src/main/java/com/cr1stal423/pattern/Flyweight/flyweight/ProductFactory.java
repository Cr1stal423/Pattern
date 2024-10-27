package com.cr1stal423.pattern.Flyweight.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private static final Map<String, ProductFlyweight> products = new HashMap<>();

    public static ProductFlyweight getProduct(String name, String category, double price) {
        String key = name + "_" + category + "_" + price;
        if (!products.containsKey(key)) {
            products.put(key, new ConcreteProduct(name, category, price));
            System.out.println("Creating new product: " + name);
        } else {
            System.out.println("Reusing existing product: " + name);
        }
        return products.get(key);
    }
}
