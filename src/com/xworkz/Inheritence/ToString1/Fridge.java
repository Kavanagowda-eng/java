package com.xworkz.Inheritence.ToString1;

public class Fridge {
    private String brand;
    private int capacity;
    private boolean color;

    public Fridge(String brand, int capacity, boolean color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fridge: brand=" + brand + ", capacity=" + capacity + ", color=" + color;

    }
}
