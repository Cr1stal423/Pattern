package com.cr1stal423.pattern.Objectpool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductPool productPool;

    @Autowired
    public ProductService(ProductPool productPool) {
        this.productPool = productPool;
    }

    public Product getProduct() {
        return productPool.acquireProduct();
    }

    public void returnProduct(Product product) {
        productPool.releaseProduct(product);
    }
}
