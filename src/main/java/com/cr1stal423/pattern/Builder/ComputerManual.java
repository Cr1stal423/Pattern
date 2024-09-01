package com.cr1stal423.pattern.Builder;

import lombok.Data;

@Data
public class ComputerManual {
    private final String processor;
    private final int ram;
    private final int storage;
    private final String graphicsCard;
    private final String operatingSystem;

    public String print() {
        return "Computer Manual:\n" +
                "Processor: " + processor + "\n" +
                "RAM: " + ram + "GB\n" +
                "Storage: " + storage + "GB\n" +
                "Graphics Card: " + graphicsCard + "\n" +
                "Operating System: " + operatingSystem;
    }
}
