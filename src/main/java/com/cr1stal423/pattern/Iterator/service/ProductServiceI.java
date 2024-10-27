package com.cr1stal423.pattern.Iterator.service;


import com.cr1stal423.pattern.Iterator.collection.ProductCollection;
import com.cr1stal423.pattern.Iterator.iterator.ProductIterator;
import com.cr1stal423.pattern.Iterator.model.ProductI;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceI {
    private final ProductCollection productCollection = new ProductCollection();

    public void addProduct(ProductI product) {
        productCollection.addProduct(product);
    }

    public ProductIterator getIterator() {
        return productCollection.iterator();
    }
}