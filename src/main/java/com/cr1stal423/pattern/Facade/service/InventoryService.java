package com.cr1stal423.pattern.Facade.service;

import com.cr1stal423.pattern.Facade.model.Product;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    public boolean checkAvailability(Product product) {
        return product.getQuantity() > 0;
    }

    public void updateStock(Product product, int quantity) {
        product.setQuantity(product.getQuantity() - quantity);
        System.out.println("Stock updated for product: " + product.getName());
    }
}