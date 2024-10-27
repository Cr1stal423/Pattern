package com.cr1stal423.pattern.Memento;

import java.util.Stack;

public class ProductCaretaker {
    private final Stack<ProductMemento> mementoStack = new Stack<>();

    public void saveMemento(ProductMemento memento) {
        mementoStack.push(memento);
    }

    public ProductMemento getMemento() {
        if (!mementoStack.isEmpty()) {
            return mementoStack.pop();
        }
        return null;
    }
}
