package com.cr1stal423.pattern.Template.service;

import org.springframework.stereotype.Service;

@Service("creditCardPurchase")
public class CreditCardPurchase extends AbstractPurchaseTemplate {

    @Override
    protected void selectItem() {
        System.out.println("Товар обрано для оплати кредитною карткою.");
    }

    @Override
    protected void calculatePrice(double amount) {
        System.out.println("Сума для оплати карткою: " + amount + " грн");
    }

    @Override
    protected void performPayment() {
        System.out.println("Оплата здійснена кредитною карткою.");
    }

    @Override
    protected void deliver() {
        System.out.println("Товар видано покупцю.");
    }
}
