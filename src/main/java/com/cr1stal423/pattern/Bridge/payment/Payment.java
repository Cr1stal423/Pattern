package com.cr1stal423.pattern.Bridge.payment;

import com.cr1stal423.pattern.Bridge.processor.PaymentProcessor;

import java.util.List;

public abstract class Payment {

    protected final List<PaymentProcessor> paymentProcessors;

    public Payment(List<PaymentProcessor> paymentProcessors) {
        this.paymentProcessors = paymentProcessors;
    }

    public abstract void pay(double amount);
}
