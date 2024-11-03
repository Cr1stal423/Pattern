package com.cr1stal423.pattern.Strategy.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceS {

    private final PaymentContext paymentContext;

    public PaymentServiceS(PaymentContext paymentContext) {
        this.paymentContext = paymentContext;
    }

    public void processPayment(String paymentType, double amount) {
        paymentContext.executePayment(paymentType, amount);
    }
}

