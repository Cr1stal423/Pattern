package com.cr1stal423.pattern.Bridge.payment;

import com.cr1stal423.pattern.Bridge.processor.PaymentProcessor;

import java.util.List;


public class OnlinePayment extends Payment {

    public OnlinePayment(List<PaymentProcessor> paymentProcessors) {
        super(paymentProcessors);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Online payment initiated.");
        // Наприклад, обираємо перший PaymentProcessor з колекції
        if (!paymentProcessors.isEmpty()) {
            paymentProcessors.get(0).processPayment(amount);
        }
    }

}
