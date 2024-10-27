package com.cr1stal423.pattern.Proxy.proxy;

import com.cr1stal423.pattern.Proxy.model.ProductDetails;

public interface ProductService {
    void sellProduct(ProductDetails productDetails, int quantity);
}
