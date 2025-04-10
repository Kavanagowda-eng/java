package com.xworkz.Inheritence.ToString1;

public class Scooter {
    private String brand;
    private int engineCC;
    private boolean type;

    public Scooter(String brand, int engineCC, boolean type) {
        this.brand = brand;
        this.engineCC = engineCC;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Scooter: brand=" + brand + ", engineCC=" + engineCC + ", type=" + type;
    }
    @Override
    public int hashCode() {
        return 94;
    }
}
