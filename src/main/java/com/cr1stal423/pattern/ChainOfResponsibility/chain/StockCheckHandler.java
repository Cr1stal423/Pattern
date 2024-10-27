package com.cr1stal423.pattern.ChainOfResponsibility.chain;

import com.cr1stal423.pattern.ChainOfResponsibility.model.ProductOrder;
import org.springframework.stereotype.Component;

@Component
public class StockCheckHandler extends OrderHandler {

    @Override
    public void handle(ProductOrder order) {
        if (order.getQuantity() > 0) {
            System.out.println("Stock check passed for product: " + order.getProductName());
            order.setStockAvailable(true);
        } else {
            System.out.println("Stock check failed. Product is not available.");
        }
        super.handle(order);
    }
}
