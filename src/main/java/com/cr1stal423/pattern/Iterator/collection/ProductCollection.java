package com.cr1stal423.pattern.Iterator.collection;

import com.cr1stal423.pattern.Iterator.model.ProductI;
import com.cr1stal423.pattern.Iterator.iterator.ProductIterator;
import com.cr1stal423.pattern.Iterator.iterator.ProductIteratorImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private final List<ProductI> products = new ArrayList<>();

    public void addProduct(ProductI product) {
        products.add(product);
    }

    public ProductIterator iterator() {
        return new ProductIteratorImpl(products);
    }
}
