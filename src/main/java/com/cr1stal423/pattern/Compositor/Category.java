package com.cr1stal423.pattern.Compositor;

import java.util.ArrayList;
import java.util.List;

public class Category implements ProductComponent{
    private String name;

    private List<ProductComponent> productComponents = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void addComponent(ProductComponent component){
        productComponents.add(component);
    }
    public void removeComponent(ProductComponent component){
        productComponents.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Category: " + name);
        for (ProductComponent component : productComponents) {
            component.showDetails();
        }
    }
}
