package com.cr1stal423.pattern.Strategy.service.strategy;

import org.springframework.stereotype.Service;

@Service("creditCardPaymentStrategy")
public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата кредитною карткою: " + amount + " грн");
    }
}
