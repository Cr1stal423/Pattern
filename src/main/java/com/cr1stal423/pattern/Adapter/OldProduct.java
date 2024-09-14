package com.cr1stal423.pattern.Adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OldProduct {
    private String productName;
    private int stockAmount;

    public OldProduct(String productName, int stockAmount) {
        this.productName = productName;
        this.stockAmount = stockAmount;
    }

}
