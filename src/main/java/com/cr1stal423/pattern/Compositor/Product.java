package com.cr1stal423.pattern.Compositor;

public class Product implements ProductComponent{
    private String name;
    private Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + name + " Price: " + price);
    }
}
