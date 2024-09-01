package com.cr1stal423.pattern.Builder;

public interface ComputerBuilder {
    void setProcessor(String processor);
    void setRAM(int ram);
    void setStorage(int storage);
    void setGraphicsCard(String graphicsCard);
    void setOperatingSystem(String operatingSystem);
}
