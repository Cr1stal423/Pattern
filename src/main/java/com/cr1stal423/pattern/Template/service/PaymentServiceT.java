package com.cr1stal423.pattern.Template.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentServiceT {

    private final Map<String, AbstractPurchaseTemplate> purchaseStrategies;

    public PaymentServiceT(Map<String, AbstractPurchaseTemplate> purchaseStrategies) {
        this.purchaseStrategies = purchaseStrategies;
    }

    public void processOrder(String purchaseType, double amount) {
        AbstractPurchaseTemplate purchaseStrategy = purchaseStrategies.get(purchaseType);
        if (purchaseStrategy == null) {
            throw new IllegalArgumentException("Невідомий тип покупки: " + purchaseType);
        }
        purchaseStrategy.processPurchase(amount);
    }
}