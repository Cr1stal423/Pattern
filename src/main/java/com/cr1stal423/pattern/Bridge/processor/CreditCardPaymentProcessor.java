package com.cr1stal423.pattern.Bridge.processor;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using Credit Card");
    }
}
