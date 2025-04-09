package com.xworkz.Inheritence.ToString1;

public class Jacket {
    private String brand;
    private int size;
    private boolean isWaterproof;

    public Jacket(String brand, int size, boolean isWaterproof) {
        this.brand = brand;
        this.size = size;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "Jacket: brand=" + brand + ", size=" + size + ", isWaterproof=" + isWaterproof;
    }
}
