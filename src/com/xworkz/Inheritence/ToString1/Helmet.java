package com.xworkz.Inheritence.ToString1;

public class Helmet {
    private String brand;
    private int size;
    private boolean type;

    public Helmet(String brand, int size, boolean type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Helmet: brand=" + brand + ", size=" + size + ", type=" + type;
    }
}
