package com.cr1stal423.pattern.ChainOfResponsibility.chain;

import com.cr1stal423.pattern.ChainOfResponsibility.model.ProductOrder;

public abstract class OrderHandler {
    protected OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(ProductOrder order) {
        if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }
}
