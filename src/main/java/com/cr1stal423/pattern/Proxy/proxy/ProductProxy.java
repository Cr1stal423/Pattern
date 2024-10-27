package com.cr1stal423.pattern.Proxy.proxy;

import com.cr1stal423.pattern.Proxy.model.ProductDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProductProxy implements ProductService {

    private final RealProductService realProductService;

    @Autowired
    public ProductProxy(RealProductService realProductService) {
        this.realProductService = realProductService;
    }

    @Override
    public void sellProduct(ProductDetails productDetails, int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity. Cannot sell " + quantity + " units.");
            return;
        }
        logProductDetails(productDetails, quantity);
        realProductService.sellProduct(productDetails, quantity);
    }

    private void logProductDetails(ProductDetails productDetails, int quantity) {
        log.info("Log: Selling " + quantity + " units of product: " + productDetails.getName() +
                " in category " + productDetails.getCategory() + " at price $" + productDetails.getPrice());
    }
}
