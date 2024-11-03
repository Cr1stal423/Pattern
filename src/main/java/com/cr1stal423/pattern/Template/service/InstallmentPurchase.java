package com.cr1stal423.pattern.Template.service;

import org.springframework.stereotype.Service;

@Service("installmentPurchase")
public class InstallmentPurchase extends AbstractPurchaseTemplate {

    @Override
    protected void selectItem() {
        System.out.println("Товар обрано для покупки в розстрочку.");
    }

    @Override
    protected void calculatePrice(double amount) {
        System.out.println("Сума для оплати в розстрочку: " + amount + " грн");
    }

    @Override
    protected void performPayment() {
        System.out.println("Перший платіж в розстрочку здійснено.");
    }

    @Override
    protected void deliver() {
        System.out.println("Товар видано покупцю.");
    }
}
