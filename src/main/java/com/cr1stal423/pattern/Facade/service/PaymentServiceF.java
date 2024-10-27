package com.cr1stal423.pattern.Facade.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceF {
    public boolean processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed successfully.");
        return true;
    }
}