package com.cr1stal423.pattern.Memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ProductM {
    private String name;
    private double price;
    private int quantity;

    public ProductMemento save() {
        return new ProductMemento(name, price, quantity);
    }

    public void restore(ProductMemento memento) {
        this.name = memento.getName();
        this.price = memento.getPrice();
        this.quantity = memento.getQuantity();
    }
}
