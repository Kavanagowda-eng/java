package com.xworkz.Inheritence.ToString1;

public class WashingMachine {
    private String brand;
    private int loadCapacity;
    private boolean type;

    public WashingMachine(String brand, int loadCapacity, boolean type) {
        this.brand = brand;
        this.loadCapacity = loadCapacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "WashingMachine: brand=" + brand + ", loadCapacity=" + loadCapacity + ", type=" + type;
    }
}
