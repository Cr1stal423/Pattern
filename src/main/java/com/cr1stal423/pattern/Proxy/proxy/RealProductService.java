package com.cr1stal423.pattern.Proxy.proxy;

import com.cr1stal423.pattern.Proxy.model.ProductDetails;
import org.springframework.stereotype.Service;

@Service
public class RealProductService implements ProductService {

    @Override
    public void sellProduct(ProductDetails productDetails, int quantity) {
        System.out.println("Selling " + quantity + " units of product: " + productDetails.getName() +
                " in category " + productDetails.getCategory() + " at price $" + productDetails.getPrice());
    }
}
