package com.cr1stal423.pattern.Command.command;

import org.springframework.stereotype.Component;

@Component
public class SellTabletCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Продаж планшета виконано!");
    }
}