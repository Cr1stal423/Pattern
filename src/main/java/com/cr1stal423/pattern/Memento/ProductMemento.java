package com.cr1stal423.pattern.Memento;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductMemento {
    private final String name;
    private final double price;
    private final int quantity;
}
