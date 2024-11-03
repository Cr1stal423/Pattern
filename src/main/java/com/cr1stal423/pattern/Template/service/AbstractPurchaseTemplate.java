package com.cr1stal423.pattern.Template.service;


public abstract class AbstractPurchaseTemplate {

    public final void processPurchase(double amount) {
        selectItem();
        calculatePrice(amount);
        performPayment();
        generateReceipt();
        deliver();
    }

    protected abstract void selectItem();
    protected abstract void calculatePrice(double amount);
    protected abstract void performPayment();
    protected abstract void deliver();

    private void generateReceipt() {
        System.out.println("Квитанція згенерована.");
    }
}