package com.cr1stal423.pattern.Flyweight.model;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class ProductDetails {
    private String name;
    private String category;
    private double price;

    public ProductDetails(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

}
