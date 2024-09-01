package com.cr1stal423.pattern.Builder;

public class ComputerManualBuilder implements ComputerBuilder{
    private String processor;
    private int ram;
    private int storage;
    private String graphicsCard;
    private String operatingSystem;

    @Override
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public void setRAM(int ram) {
        this.ram = ram;
    }

    @Override
    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public ComputerManual getResult() {
        return new ComputerManual(processor, ram, storage, graphicsCard, operatingSystem);
    }
}
