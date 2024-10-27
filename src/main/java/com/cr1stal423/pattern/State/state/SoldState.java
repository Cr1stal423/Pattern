package com.cr1stal423.pattern.State.state;

import org.springframework.stereotype.Component;

@Component
public class SoldState implements ProductState {
    @Override
    public void handleRequest() {
        System.out.println("Продукт вже продано.");
    }
}