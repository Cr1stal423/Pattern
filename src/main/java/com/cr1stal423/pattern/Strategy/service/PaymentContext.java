package com.cr1stal423.pattern.Strategy.service;

import com.cr1stal423.pattern.Strategy.service.strategy.PaymentStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentContext {

    private final Map<String, PaymentStrategy> strategies;

    public PaymentContext(Map<String, PaymentStrategy> strategies) {
        this.strategies = strategies;
    }

    public void executePayment(String paymentType, double amount) {
        PaymentStrategy strategy = strategies.get(paymentType);
        if (strategy == null) {
            throw new IllegalArgumentException("Невідома стратегія оплати: " + paymentType);
        }
        strategy.pay(amount);
    }
}
