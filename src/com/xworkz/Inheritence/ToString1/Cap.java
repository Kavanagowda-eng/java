package com.xworkz.Inheritence.ToString1;

public class Cap {
    private String brand;
    private int size;
    private boolean type;

    public Cap(String brand, int size, boolean type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cap: brand=" + brand + ", size=" + size + ", type=" + type;
    }
    @Override
    public int hashCode() {
        return 45;
    }
}
