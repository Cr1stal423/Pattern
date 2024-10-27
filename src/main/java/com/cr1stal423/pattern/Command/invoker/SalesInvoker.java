package com.cr1stal423.pattern.Command.invoker;

import com.cr1stal423.pattern.Command.command.Command;
import org.springframework.stereotype.Component;

@Component
public class SalesInvoker {
    public void executeCommand(Command command) {
        command.execute();
    }
}