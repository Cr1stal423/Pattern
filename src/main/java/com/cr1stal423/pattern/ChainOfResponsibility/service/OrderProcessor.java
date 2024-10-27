package com.cr1stal423.pattern.ChainOfResponsibility.service;

import com.cr1stal423.pattern.ChainOfResponsibility.chain.OrderHandler;
import com.cr1stal423.pattern.ChainOfResponsibility.model.ProductOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessor {

    private final OrderHandler stockCheckHandler;
    private final OrderHandler paymentHandler;
    private final OrderHandler deliveryHandler;

    @Autowired
    public OrderProcessor(OrderHandler stockCheckHandler, OrderHandler paymentHandler, OrderHandler deliveryHandler) {
        this.stockCheckHandler = stockCheckHandler;
        this.paymentHandler = paymentHandler;
        this.deliveryHandler = deliveryHandler;

        // Set chain of responsibility
        stockCheckHandler.setNextHandler(paymentHandler);
        paymentHandler.setNextHandler(deliveryHandler);
    }

    public void processOrder(ProductOrder order) {
        stockCheckHandler.handle(order);
    }
}