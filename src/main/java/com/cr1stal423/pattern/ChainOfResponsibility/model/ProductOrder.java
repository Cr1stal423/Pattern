package com.cr1stal423.pattern.ChainOfResponsibility.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductOrder {
    private String productName;
    private int quantity;
    private boolean paymentProcessed;
    private boolean stockAvailable;
    private boolean delivered;

    public ProductOrder(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
        this.paymentProcessed = false;
        this.stockAvailable = false;
        this.delivered = false;
    }
}
