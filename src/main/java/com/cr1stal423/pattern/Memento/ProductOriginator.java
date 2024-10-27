package com.cr1stal423.pattern.Memento;

public class ProductOriginator {
    private ProductM product;
    private final ProductCaretaker caretaker = new ProductCaretaker();

    public ProductOriginator(ProductM product) {
        this.product = product;
    }

    public void changeProductDetails(String name, double price, int quantity) {
        caretaker.saveMemento(product.save());
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);
    }

    public void undoChanges() {
        ProductMemento memento = caretaker.getMemento();
        if (memento != null) {
            product.restore(memento);
        }
    }

    public ProductM getProduct() {
        return product;
    }
}