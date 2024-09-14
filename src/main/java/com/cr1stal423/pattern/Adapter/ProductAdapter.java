package com.cr1stal423.pattern.Adapter;

public class ProductAdapter implements Product{

    private final OldProduct oldProduct;

    public ProductAdapter(OldProduct oldProduct) {
        this.oldProduct = oldProduct;
    }

    @Override
    public String getName() {
        return oldProduct.getProductName();
    }

    @Override
    public int getQuantity() {
        return oldProduct.getStockAmount();
    }
}
