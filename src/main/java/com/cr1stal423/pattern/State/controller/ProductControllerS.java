package com.cr1stal423.pattern.State.controller;

import com.cr1stal423.pattern.State.state.AvailableState;
import com.cr1stal423.pattern.State.state.OutOfStockState;
import com.cr1stal423.pattern.State.state.ProductS;
import com.cr1stal423.pattern.State.state.SoldState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/state/products")
public class ProductControllerS {

    private final ProductS product;

    @Autowired
    public ProductControllerS(AvailableState availableState) {
        this.product = new ProductS(availableState);
    }

    @PutMapping("/setAvailable")
    public String setAvailable() {
        product.setState(new AvailableState());
        return "Продукт тепер доступний.";
    }

    @PutMapping("/setOutOfStock")
    public String setOutOfStock() {
        product.setState(new OutOfStockState());
        return "Продукт тепер відсутній на складі.";
    }

    @PutMapping("/setSold")
    public String setSold() {
        product.setState(new SoldState());
        return "Продукт тепер продано.";
    }

    @GetMapping("/status")
    public String checkStatus() {
        product.request();
        return "Статус продукту перевірено.";
    }
}
