package com.cr1stal423.pattern.Builder;

public class Director {

    public void constructGamingComputer(ComputerBuilder builder) {
        builder.setProcessor("Intel Core i9");
        builder.setRAM(32);
        builder.setStorage(2000);
        builder.setGraphicsCard("NVIDIA GeForce RTX 4090");
        builder.setOperatingSystem("Windows 11");
    }

    public void constructOfficeComputer(ComputerBuilder builder) {
        builder.setProcessor("Intel Core i5");
        builder.setRAM(16);
        builder.setStorage(512);
        builder.setGraphicsCard("Integrated");
        builder.setOperatingSystem("Windows 10");
    }
}
