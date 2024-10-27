package com.cr1stal423.pattern.Iterator.iterator;

import com.cr1stal423.pattern.Iterator.model.ProductI;

import java.util.List;

public class ProductIteratorImpl implements ProductIterator {
    private final List<ProductI> products;
    private int position = 0;

    public ProductIteratorImpl(List<ProductI> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return position < products.size();
    }

    @Override
    public ProductI next() {
        return hasNext() ? products.get(position++) : null;
    }
}
