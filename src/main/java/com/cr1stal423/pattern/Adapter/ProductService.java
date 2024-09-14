package com.cr1stal423.pattern.Adapter;

public class ProductService {
    public void displayProductInfo(Product product){
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product quantity: " + product.getQuantity());
    }
}
