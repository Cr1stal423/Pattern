package com.cr1stal423.pattern.Decorator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllerD {
    private final IProductService productService;

    @Autowired
    public ProductControllerD(@Qualifier("productServiceDecorator")IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/manufacture")
    public String manufactureProduct() {
        productService.manufactureProduct();
        return "Product manufacturing process completed.";
    }
}
