package com.xworkz.Inheritence.ToString1;

public class Motorcycle {
    private String brand;
    private int engineCC;
    private boolean type;

    public Motorcycle(String brand, int engineCC, boolean type) {
        this.brand = brand;
        this.engineCC = engineCC;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Motorcycle: brand=" + brand + ", engineCC=" + engineCC + ", type=" + type;
    }
}
