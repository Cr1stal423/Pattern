package com.cr1stal423.pattern.Observer.controller;

import com.cr1stal423.pattern.Observer.component.PriceObserver;
import com.cr1stal423.pattern.Observer.component.ProductO;
import com.cr1stal423.pattern.Observer.component.StockObserver;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/observer/products")
public class ProductControllerO {

    private final ProductO product;

    public ProductControllerO(StockObserver stockObserver, PriceObserver priceObserver) {
        this.product = new ProductO("Ноутбук", 1500.0, 10);
        this.product.addObserver(stockObserver);
        this.product.addObserver(priceObserver);
    }

    @PutMapping("/updatePrice")
    public String updatePrice(@RequestParam double price) {
        product.setPrice(price);
        return "Ціна продукту оновлена: " + product.getName() + " до $" + price;
    }

    @PutMapping("/updateQuantity")
    public String updateQuantity(@RequestParam int quantity) {
        product.setQuantity(quantity);
        return "Кількість продукту оновлена: " + product.getName() + " до " + quantity;
    }

    @GetMapping("/details")
    public ProductO getProductDetails() {
        return product;
    }
}
