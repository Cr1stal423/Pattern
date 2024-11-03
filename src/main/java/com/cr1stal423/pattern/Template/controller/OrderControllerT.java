package com.cr1stal423.pattern.Template.controller;

import com.cr1stal423.pattern.Template.service.PaymentServiceT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderControllerT {
    private final PaymentServiceT paymentService;

    @Autowired
    public OrderControllerT(PaymentServiceT paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/purchase")
    public String purchase(@RequestParam double amount, @RequestParam String purchaseType) {
        try {
            paymentService.processOrder(purchaseType, amount);
            return "Покупка на суму " + amount + " успішно здійснена через " + purchaseType;
        } catch (IllegalArgumentException e) {
            return "Помилка: " + e.getMessage();
        }
    }
}
