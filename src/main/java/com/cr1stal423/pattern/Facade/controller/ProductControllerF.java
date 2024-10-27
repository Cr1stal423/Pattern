package com.cr1stal423.pattern.Facade.controller;

import com.cr1stal423.pattern.Facade.facade.ProductSaleFacade;
import com.cr1stal423.pattern.Facade.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllerF {

    private final ProductSaleFacade productSaleFacade;

    @Autowired
    public ProductControllerF(ProductSaleFacade productSaleFacade) {
        this.productSaleFacade = productSaleFacade;
    }

    @GetMapping("/facade/sellProduct")
    public String sellProduct(@RequestParam String name, @RequestParam double price, @RequestParam int quantity) {
        Product product = new Product(name, price, 10);
        productSaleFacade.sellProduct(product, quantity);
        return "Product sale process completed.";
    }
}

