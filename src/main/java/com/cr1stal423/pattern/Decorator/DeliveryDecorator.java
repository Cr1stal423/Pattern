package com.cr1stal423.pattern.Decorator;

public class DeliveryDecorator extends ProductDecorator{

    public DeliveryDecorator(IProductService productService) {
        super(productService);
    }

    @Override
    public void manufactureProduct() {
        super.manufactureProduct();
        arrangeDelivery();
    }

    private void arrangeDelivery() {
        System.out.println("Arranging delivery for the product...");
    }
}
