package com.cr1stal423.pattern.Strategy.service.strategy;

import org.springframework.stereotype.Service;

@Service("installmentPaymentStrategy")
public class InstallmentPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата в розстрочку: " + amount + " грн");
    }
}
