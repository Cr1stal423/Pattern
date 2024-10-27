package com.cr1stal423.pattern.ChainOfResponsibility.controller;

import com.cr1stal423.pattern.ChainOfResponsibility.service.OrderProcessor;
import com.cr1stal423.pattern.ChainOfResponsibility.model.ProductOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final OrderProcessor orderProcessor;

    @Autowired
    public ProductController(OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    @GetMapping("/processOrder")
    public String processOrder(@RequestParam String productName, @RequestParam int quantity) {
        ProductOrder order = new ProductOrder(productName, quantity);
        orderProcessor.processOrder(order);

        return order.isDelivered() ?
                "Order for " + productName + " has been successfully processed and delivered." :
                "Order for " + productName + " could not be completed.";
    }
}

