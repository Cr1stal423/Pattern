package com.cr1stal423.pattern.Command.command;

import org.springframework.stereotype.Component;

@Component
public class SellSmartphoneCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Продаж смартфона виконано!");
    }
}