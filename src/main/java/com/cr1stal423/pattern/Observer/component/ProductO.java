package com.cr1stal423.pattern.Observer.component;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ProductO {
    private String name;
    private double price;
    private int quantity;
    private final List<Observer> observers = new ArrayList<>();

    public ProductO(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name, price, quantity);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyObservers();
    }


}
