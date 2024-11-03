package com.cr1stal423.pattern.Strategy.controller;

import com.cr1stal423.pattern.Strategy.service.PaymentServiceS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderControllerS {

    private final PaymentServiceS paymentService;

    @Autowired
    public OrderControllerS(PaymentServiceS paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/checkout")
    public String checkout(@RequestParam double amount, @RequestParam String paymentType) {
        try {
            paymentService.processPayment(paymentType, amount);
            return "Оплата на суму " + amount + " успішно здійснена через " + paymentType;
        } catch (IllegalArgumentException e) {
            return "Помилка: " + e.getMessage();
        }
    }
}