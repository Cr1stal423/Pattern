package com.cr1stal423.pattern.Visitor.controller;

import com.cr1stal423.pattern.Visitor.model.Appliance;
import com.cr1stal423.pattern.Visitor.model.LaptopV;
import com.cr1stal423.pattern.Visitor.model.PhoneV;
import com.cr1stal423.pattern.Visitor.model.ProductV;
import com.cr1stal423.pattern.Visitor.service.ProductServiceV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductControllerV {

    private final ProductServiceV productService;

    @Autowired
    public ProductControllerV(ProductServiceV productService) {
        this.productService = productService;
    }

    @GetMapping("/discounts")
    public String applyDiscounts() {
        List<ProductV> products = Arrays.asList(
                new PhoneV("iPhone", 1000),
                new LaptopV("Dell XPS", 2000),
                new Appliance("Samsung TV", 1500)
        );
        productService.applyDiscounts(products);
        return "Знижки застосовані.";
    }

    @GetMapping("/promotions")
    public String applyPromotions() {
        List<ProductV> products = Arrays.asList(
                new PhoneV("iPhone", 1000),
                new LaptopV("Dell XPS", 2000),
                new Appliance("Samsung TV", 1500)
        );
        productService.applyPromotions(products);
        return "Акції застосовані.";
    }
}