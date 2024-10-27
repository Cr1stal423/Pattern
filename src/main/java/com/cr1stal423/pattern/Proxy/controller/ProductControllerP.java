package com.cr1stal423.pattern.Proxy.controller;

import com.cr1stal423.pattern.Proxy.model.ProductDetails;
import com.cr1stal423.pattern.Proxy.proxy.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllerP {

    private final ProductService productProxy;

    @Autowired
    public ProductControllerP(ProductService productProxy) {
        this.productProxy = productProxy;
    }

    @GetMapping("/sellProduct")
    public String sellProduct(@RequestParam String name, @RequestParam String category,
                              @RequestParam double price, @RequestParam int quantity) {
        ProductDetails productDetails = new ProductDetails(name, category, price);
        productProxy.sellProduct(productDetails, quantity);
        return "Product sale process completed.";
    }
}
