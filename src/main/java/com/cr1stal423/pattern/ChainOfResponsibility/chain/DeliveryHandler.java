package com.cr1stal423.pattern.ChainOfResponsibility.chain;

import com.cr1stal423.pattern.ChainOfResponsibility.model.ProductOrder;
import org.springframework.stereotype.Component;

@Component
public class DeliveryHandler extends OrderHandler {

    @Override
    public void handle(ProductOrder order) {
        if (order.isPaymentProcessed()) {
            System.out.println("Delivering product: " + order.getProductName());
            order.setDelivered(true);
        } else {
            System.out.println("Cannot deliver. Payment is not processed.");
        }
        super.handle(order);
    }
}
