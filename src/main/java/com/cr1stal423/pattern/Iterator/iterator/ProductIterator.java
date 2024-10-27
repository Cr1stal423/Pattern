package com.cr1stal423.pattern.Iterator.iterator;

import com.cr1stal423.pattern.Facade.model.Product;
import com.cr1stal423.pattern.Iterator.model.ProductI;

public interface ProductIterator {
    boolean hasNext();
    ProductI next();
}
