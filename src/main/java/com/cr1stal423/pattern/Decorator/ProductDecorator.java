package com.cr1stal423.pattern.Decorator;

public abstract class ProductDecorator implements IProductService {
    protected IProductService productService;

    public ProductDecorator(IProductService productService) {
        this.productService = productService;
    }

    @Override
    public void manufactureProduct() {
        productService.manufactureProduct();
    }
}
