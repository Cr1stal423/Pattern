package com.cr1stal423.pattern.Memento;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductControllerM {
    private final ProductOriginator productOriginator;

    public ProductControllerM() {
        ProductM product = new ProductM("Ноутбук", 1500.0, 10);
        this.productOriginator = new ProductOriginator(product);
    }

    @PutMapping("/update")
    public String updateProduct(@RequestParam String name, @RequestParam double price, @RequestParam int quantity) {
        productOriginator.changeProductDetails(name, price, quantity);
        return "Продукт оновлено: " + productOriginator.getProduct().getName();
    }

    @PostMapping("/undo")
    public String undoUpdate() {
        productOriginator.undoChanges();
        return "Останнє оновлення скасовано. Тепер: " + productOriginator.getProduct().getName();
    }

    @GetMapping("/details")
    public ProductM getProductDetails() {
        return productOriginator.getProduct();
    }
}
