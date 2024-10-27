package com.cr1stal423.pattern.Command.controller;

import com.cr1stal423.pattern.Command.command.SellLaptopCommand;
import com.cr1stal423.pattern.Command.command.SellSmartphoneCommand;
import com.cr1stal423.pattern.Command.command.SellTabletCommand;
import com.cr1stal423.pattern.Command.invoker.SalesInvoker;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sales")
@AllArgsConstructor
public class SalesController {

    private final SalesInvoker salesInvoker;
    private final SellSmartphoneCommand sellSmartphoneCommand;
    private final SellLaptopCommand sellLaptopCommand;
    private final SellTabletCommand sellTabletCommand;

    @GetMapping("/smartphone")
    public String sellSmartphone() {
        salesInvoker.executeCommand(sellSmartphoneCommand);
        return "Смартфон продано!";
    }

    @GetMapping("/laptop")
    public String sellLaptop() {
        salesInvoker.executeCommand(sellLaptopCommand);
        return "Ноутбук продано!";
    }

    @GetMapping("/tablet")
    public String sellTablet() {
        salesInvoker.executeCommand(sellTabletCommand);
        return "Планшет продано!";
    }
}