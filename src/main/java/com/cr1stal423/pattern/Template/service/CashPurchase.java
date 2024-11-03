package com.cr1stal423.pattern.Template.service;

import org.springframework.stereotype.Service;

@Service("cashPurchase")
public class CashPurchase extends AbstractPurchaseTemplate {

    @Override
    protected void selectItem() {
        System.out.println("Товар обрано для оплати готівкою.");
    }

    @Override
    protected void calculatePrice(double amount) {
        System.out.println("Сума для оплати готівкою: " + amount + " грн");
    }

    @Override
    protected void performPayment() {
        System.out.println("Оплата здійснена готівкою.");
    }

    @Override
    protected void deliver() {
        System.out.println("Товар видано покупцю.");
    }
}