package com.cr1stal423.pattern.Flyweight.flyweight;

import com.cr1stal423.pattern.Flyweight.model.ProductDetails;

public interface ProductFlyweight {
    void sellProduct(int quantity);
    ProductDetails getDetails();
}