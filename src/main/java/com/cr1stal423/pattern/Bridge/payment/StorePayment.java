package com.cr1stal423.pattern.Bridge.payment;

import com.cr1stal423.pattern.Bridge.processor.PaymentProcessor;

import java.util.List;

public class StorePayment extends Payment {

    public StorePayment(List<PaymentProcessor> paymentProcessors) {
        super(paymentProcessors);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Store payment initiated.");
        if (!paymentProcessors.isEmpty()) {
            paymentProcessors.get(0).processPayment(amount);
        }
    }
}
