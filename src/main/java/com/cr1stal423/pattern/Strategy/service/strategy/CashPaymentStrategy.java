package com.cr1stal423.pattern.Strategy.service.strategy;

import org.springframework.stereotype.Service;

@Service("cashPaymentStrategy")
public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата готівкою: " + amount + " грн");
    }
}