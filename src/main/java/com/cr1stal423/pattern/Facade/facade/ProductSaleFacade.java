package com.cr1stal423.pattern.Facade.facade;

import com.cr1stal423.pattern.Facade.model.Product;
import com.cr1stal423.pattern.Facade.service.InventoryService;
import com.cr1stal423.pattern.Facade.service.PaymentServiceF;
import com.cr1stal423.pattern.Facade.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductSaleFacade {

    private final InventoryService inventoryService;
    private final PaymentServiceF paymentService;
    private final ShippingService shippingService;

    @Autowired
    public ProductSaleFacade(InventoryService inventoryService, PaymentServiceF paymentService, ShippingService shippingService) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.shippingService = shippingService;
    }

    public void sellProduct(Product product, int quantity) {
        if (!inventoryService.checkAvailability(product)) {
            System.out.println("Product " + product.getName() + " is out of stock.");
            return;
        }

        double totalAmount = product.getPrice() * quantity;

        if (paymentService.processPayment(totalAmount)) {
            inventoryService.updateStock(product, quantity);
            shippingService.shipProduct(product.getName());
            System.out.println("Product " + product.getName() + " sold successfully.");
        }
    }
}