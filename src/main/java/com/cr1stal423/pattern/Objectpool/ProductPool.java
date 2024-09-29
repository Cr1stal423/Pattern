package com.cr1stal423.pattern.Objectpool;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;
@Component
public class ProductPool {
    private final Queue<Product> availableProducts = new LinkedList<>();
    private final ProductFactory productFactory;
    private final int poolSize;

    public ProductPool(ProductFactory productFactory) {
        this.productFactory = productFactory;
        this.poolSize = 10;
        initializePool();
    }

    private void initializePool() {
        for (int i = 0; i < poolSize; i++) {
            availableProducts.add(productFactory.createProduct("Product" + (i + 1), 100));
        }
    }

    public Product acquireProduct() {
        if (availableProducts.isEmpty()) {

            return productFactory.createProduct("Product" + (poolSize + 1), 100);
        }
        return availableProducts.poll();
    }

    public void releaseProduct(Product product) {
        if (availableProducts.size() < poolSize) {
            availableProducts.add(product);
        }
    }
}