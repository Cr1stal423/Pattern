package com.cr1stal423.pattern.Flyweight.controller;

import com.cr1stal423.pattern.Flyweight.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllerFW {

    private final SaleService saleService;

    @Autowired
    public ProductControllerFW(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping("/flyweight/sellProduct")
    public String sellProduct(@RequestParam String name, @RequestParam String category,
                              @RequestParam double price, @RequestParam int quantity) {
        saleService.sellProduct(name, category, price, quantity);
        return "Product sale process completed.";
    }
}

