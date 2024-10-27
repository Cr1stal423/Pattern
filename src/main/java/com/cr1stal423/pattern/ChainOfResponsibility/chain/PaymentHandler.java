package com.cr1stal423.pattern.ChainOfResponsibility.chain;

import com.cr1stal423.pattern.ChainOfResponsibility.model.ProductOrder;
import org.springframework.stereotype.Component;

@Component
public class PaymentHandler extends OrderHandler {

    @Override
    public void handle(ProductOrder order) {
        if (order.isStockAvailable()) {
            System.out.println("Processing payment for product: " + order.getProductName());
            order.setPaymentProcessed(true);
        } else {
            System.out.println("Payment failed. Stock is not available.");
        }
        super.handle(order);
    }
}