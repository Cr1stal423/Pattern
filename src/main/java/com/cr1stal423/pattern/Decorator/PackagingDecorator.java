package com.cr1stal423.pattern.Decorator;

public class PackagingDecorator extends ProductDecorator{

    public PackagingDecorator(IProductService productService) {
        super(productService);
    }

    @Override
    public void manufactureProduct() {
        super.manufactureProduct();
        addPackaging();
    }

    private void addPackaging() {
        System.out.println("Adding packaging to the product...");
    }
}
