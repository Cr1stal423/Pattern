package com.cr1stal423.pattern.Builder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("builder")
public class BuilderRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Director director = new Director();

        GamingComputerBuilder builder = new GamingComputerBuilder();
        director.constructGamingComputer(builder);
        Computer computer = builder.getResult();
        System.out.println("computer built: " + computer);

        ComputerManualBuilder manualBuilder = new ComputerManualBuilder();
        director.constructOfficeComputer(manualBuilder);
        ComputerManual computerManual = manualBuilder.getResult();
        System.out.println("Computer manual built:\n" + computerManual.print());
    }
}
