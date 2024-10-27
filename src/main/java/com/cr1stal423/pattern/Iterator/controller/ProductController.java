package com.cr1stal423.pattern.Iterator.controller;


import com.cr1stal423.pattern.Iterator.iterator.ProductIterator;
import com.cr1stal423.pattern.Iterator.model.ProductI;
import com.cr1stal423.pattern.Iterator.service.ProductServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductServiceI productService;

    @Autowired
    public ProductController(ProductServiceI productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody ProductI product) {
        productService.addProduct(product);
        return "Продукт додано: " + product.getName();
    }

    @GetMapping("/all")
    public List<ProductI> getAllProducts() {
        List<ProductI> products = new ArrayList<>();
        ProductIterator iterator = productService.getIterator();

        while (iterator.hasNext()) {
            products.add(iterator.next());
        }

        return products;
    }
}